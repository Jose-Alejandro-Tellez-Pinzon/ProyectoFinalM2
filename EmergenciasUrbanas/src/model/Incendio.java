package model;

import utils.Niveles;


public class Incendio extends Emergencia {

    public Incendio(String tipoEmergencia, Niveles nivelDeGravedad, int tiempoDeRespuesta,
            Niveles distanciaDeBase) {
        super(tipoEmergencia, "Incendio", nivelDeGravedad, tiempoDeRespuesta, distanciaDeBase);

    }

   

    

   

}
