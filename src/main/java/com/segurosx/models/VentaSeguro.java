package com.segurosx.models;

import com.segurosx.models.IInspeccion;
import com.segurosx.models.patterns.InspeccionJudicialDecorator;
import com.segurosx.models.patterns.InspeccionSaludDecorator;
import com.segurosx.models.patterns.InspeccionFinanciera;


public class VentaSeguro {
    private IInspeccion inspeccion;

    public void mostrarInspeccionTotal() {
        this.inspeccion = new InspeccionJudicialDecorator(new InspeccionSaludDecorator(new InspeccionFinanciera()));

        inspeccion.mostrarConformidad();
    }
}