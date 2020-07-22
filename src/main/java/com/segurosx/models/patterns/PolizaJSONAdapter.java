package com.segurosx.models.patterns;

import com.segurosx.models.IExportableJSON;
import com.segurosx.models.Poliza;

public class PolizaJSONAdapter extends PolizaAdapter implements IExportableJSON{
    public PolizaJSONAdapter(Poliza poliza) {
        super(poliza);
    }

    @Override
    public String aJSON() {
        return "{" +
                    "\"numero\": " + super.getPoliza().getNumero() + ", " +
                    "\"nombresAsegurado\": " + "\"" + super.getPoliza().getNombresAsegurado() + "\"" + ", " +
                    "\"nombresTomador\": " + "\"" + super.getPoliza().getNombresTomador() + "\"" +
                "}";
                
    }
}