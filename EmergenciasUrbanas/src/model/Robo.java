package model;

import utils.Niveles;


public class Robo extends Emergencia{

    public Robo( String tipoEmergencia, Niveles nivelDeGravedad, int tiempoDeRespuesta,
            Niveles distanciaDeBase) {
        super(tipoEmergencia, "Robo", nivelDeGravedad, tiempoDeRespuesta, distanciaDeBase);
        
    }


    

}
