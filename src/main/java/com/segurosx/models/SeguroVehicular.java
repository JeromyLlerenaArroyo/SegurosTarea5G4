package com.segurosx.models;

import com.segurosx.models.patterns.CoberturaBasicaVehicular;
//import com.segurosx.models.patterns.CoberturaPorChoqueDecorator;
//import com.segurosx.models.patterns.CoberturaTodoRiesgoDecorator;
//import com.segurosx.models.patterns.CoberturaPorRoboDecorator;
import com.segurosx.models.patterns.CoberturaDecoratorFactory;

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

    public void calcularCobeturaVehicular() {

        //this.cobertura = new CoberturaTodoRiesgoDecorator(
        //                    new CoberturaBasicaVehicular());
        CoberturaDecoratorFactory cdf = new CoberturaDecoratorFactory();
        this.cobertura = cdf.createCoberturaDecorator(cdf.createCoberturaDecorator(cdf.createCoberturaDecorator(new CoberturaBasicaVehicular(),"todoriesgo"),"porrobo"),"porchoque");
        cobertura.calculaCobertura();        
    }
}