package com.segurosx.models.patterns;

import com.segurosx.models.IInspeccion;

public class InspeccionFinanciera implements IInspeccion {
    @Override
    public void mostrarConformidad() {
        System.out.println("Conformidad de inspección financiera.");
    }
}