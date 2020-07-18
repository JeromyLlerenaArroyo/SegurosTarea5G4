package com.segurosx.models.patterns;

import com.segurosx.models.IInspeccion;

public class InspeccionDecorator implements IInspeccion {

    public final IInspeccion inspeccion;

    public InspeccionDecorator(IInspeccion inspeccion) {
        this.inspeccion = inspeccion;
    }

    @Override
    public void mostrarConformidad() {
        this.inspeccion.mostrarConformidad();
    }
}