package Emergencias;

import utils.Gravedad;

public class Incendio extends Emergencia{

    public Incendio(String ubicacion, String tipoEmergencia, Gravedad nivelDeGravedad, int tiempoDeRespuesta) {
        super(ubicacion, tipoEmergencia, nivelDeGravedad, tiempoDeRespuesta);
        //TODO Auto-generated constructor stub

    }

        @Override
        public String toString() {
            return "Incendio{" +
                    "ubicacion='" + getUbicacion() + '\'' +
                    ", tipo='" + getTipoEmergencia() + '\'' +
                    ", gravedad=" + getNivelDeGravedad() +
                    ", tiempoDeRespuesta=" + getTiempoDeRespuesta() +
                    '}';
    }

   

}
