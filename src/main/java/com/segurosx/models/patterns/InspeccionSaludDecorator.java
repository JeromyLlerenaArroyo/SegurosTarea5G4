package com.segurosx.models.patterns;

import com.segurosx.models.IInspeccion;

public class InspeccionSaludDecorator extends InspeccionDecorator{
    public InspeccionSaludDecorator(IInspeccion inspeccion) {
        super(inspeccion);
    }

    @Override
    public void mostrarConformidad() {
        super.mostrarConformidad();

        mostrarConformidadSalud();
    }

    public void mostrarConformidadSalud() {
        System.out.println("Conformidad en inspección de salud.");
    }
}