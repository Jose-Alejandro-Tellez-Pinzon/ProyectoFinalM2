package model.factory;

import model.AccidenteVehicular;
import model.Emergencia;
import model.Incendio;
import model.Robo;
import utils.Niveles;
import utils.TipoEmergencia;

public class FactoryEmergencias {

    public static Emergencia CrearEmergencia  (TipoEmergencia tipoEmergencia, String ubicacion, Niveles nivelGravedad, int timepoRespuesta, Niveles distanciaDeBase) {
       
        switch (tipoEmergencia) {
            case INCENDIO:
                return new Incendio(ubicacion, nivelGravedad, timepoRespuesta, distanciaDeBase);
            case ROBO:
                return new Robo(ubicacion, nivelGravedad, timepoRespuesta, distanciaDeBase);
            case ACCIDENTE_VEHICULAR:
                return new AccidenteVehicular(ubicacion, nivelGravedad, timepoRespuesta, distanciaDeBase);
            default:
                return null;
        }
    }

}
