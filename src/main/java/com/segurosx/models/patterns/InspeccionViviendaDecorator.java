package com.segurosx.models.patterns;

import com.segurosx.models.IInspeccion;

public class InspeccionViviendaDecorator extends InspeccionDecorator{
    public InspeccionViviendaDecorator(IInspeccion inspeccion) {
        super(inspeccion);
    }

    @Override
    public void mostrarConformidad() {
        super.mostrarConformidad();

        mostrarConformidadVivienda();
    }

    public void mostrarConformidadVivienda() {
        System.out.println("Conformidad en inspección de vivienda.");
    }
}