package com.segurosx.models.patterns;

import com.segurosx.models.patterns.CoberturaPorChoqueDecorator;
import com.segurosx.models.patterns.CoberturaPorRoboDecorator;
import com.segurosx.models.patterns.CoberturaTodoRiesgoDecorator;
import com.segurosx.models.ICobertura;

public class CoberturaDecoratorFactory {
    
    public static final String COBERTURA_DECORATOR_PORCHOQUE = "porchoque";
    public static final String COBERTURA_DECORATOR_PORROBO = "porrobo";
    public static final String COBERTURA_DECORATOR_TODORIESGO = "todoriesgo";

    public CoberturaDecorator createCoberturaDecorator(ICobertura cobertura,String typeCoberturaDecorator)   {

        if (typeCoberturaDecorator.equals(COBERTURA_DECORATOR_PORCHOQUE))  {

            return new CoberturaPorChoqueDecorator(cobertura);
        }
        else if (typeCoberturaDecorator.equals(COBERTURA_DECORATOR_PORROBO))  {

            return new CoberturaPorRoboDecorator(cobertura);
        }     
        else if (typeCoberturaDecorator.equals(COBERTURA_DECORATOR_TODORIESGO))  {

            return new CoberturaTodoRiesgoDecorator(cobertura);
        }      
        else {

            return null;
        }
    }
}