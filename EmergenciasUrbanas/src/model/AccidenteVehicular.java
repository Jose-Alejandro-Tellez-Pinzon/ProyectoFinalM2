package model;

import utils.Niveles;

public class AccidenteVehicular extends Emergencia{

    public AccidenteVehicular(String tipoEmergencia, Niveles nivelDeGravedad, int tiempoDeRespuesta,
            Niveles distanciaDeBase) {
        super(tipoEmergencia, "Accidente vehicular", nivelDeGravedad, tiempoDeRespuesta, distanciaDeBase);
        
    }

   


    
    

}
