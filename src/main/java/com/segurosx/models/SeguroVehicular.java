package com.segurosx.models;

import com.segurosx.models.patterns.CoberturaBasicaVehicular;
import com.segurosx.models.patterns.CoberturaPorChoqueDecorator;
import com.segurosx.models.patterns.CoberturaPorRoboDecorator;
import com.segurosx.models.patterns.CoberturaTodoRiesgoDecorator;

public class SeguroVehicular extends Seguro implements INivelRiesgo {

    private ICobertura cobertura;
    
    public SeguroVehicular(String marca, String modelo)    {

        super();
        this.marca = marca;
        this.modelo = modelo;

    }

    @Override
    public void calcularRiesgo() {

        if (this.marca.equals("Toyota") && this.modelo.equals("Yaris")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        } 

    }

    @Override
    public String getDetalleSeguro()    {

        return "Seg. Vehicular Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }

    public void calcularCobeturaVehicular(String entradaChoque, String entradaRobo, String entradaTodo ) {
        this.cobertura = new CoberturaBasicaVehicular();
        if ( entradaChoque.equals("S") ) {
            this.cobertura = new CoberturaPorChoqueDecorator(
                            this.cobertura);
        }

        if ( entradaRobo.equals("S") ) {
            this.cobertura = new CoberturaPorRoboDecorator(this.cobertura);
        }

        if ( entradaTodo.equals("S")) {
            this.cobertura = new CoberturaTodoRiesgoDecorator(this.cobertura);
        }
        cobertura.calculaCobertura();        
    }
}