package com.segurosx.models.patterns;

import com.segurosx.models.IInspeccion;

public class InspeccionJudicialDecorator extends InspeccionDecorator{
    public InspeccionJudicialDecorator(IInspeccion inspeccion) {
        super(inspeccion);
    }

    @Override
    public void mostrarConformidad() {
        super.mostrarConformidad();

        mostrarConformidadJudicial();
    }

    public void mostrarConformidadJudicial() {
        System.out.println("Conformidad en inspección judicial.");
    }
}