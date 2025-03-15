package Emergencias;

import utils.Gravedad;

public class Robo extends Emergencia{

    public Robo(String ubicacion, String tipoEmergencia, Gravedad nivelDeGravedad, int tiempoDeRespuesta) {
        super(ubicacion, tipoEmergencia, nivelDeGravedad, tiempoDeRespuesta);
        //TODO Auto-generated constructor stub
    }

    @Override
        public String toString() {
            return "Robo{" +
                    "ubicacion='" + getUbicacion() + '\'' +
                    ", tipo='" + getTipoEmergencia() + '\'' +
                    ", gravedad=" + getNivelDeGravedad() +
                    ", tiempoDeRespuesta=" + getTiempoDeRespuesta() +
                    '}';
    }

}
