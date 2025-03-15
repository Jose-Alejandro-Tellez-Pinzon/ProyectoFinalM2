package Emergencias;

import utils.Gravedad;

public class AccidenteVehicular  extends Emergencia{

    public AccidenteVehicular(String ubicacion, String tipoEmergencia, Gravedad nivelDeGravedad,
            int tiempoDeRespuesta) {
        super(ubicacion, tipoEmergencia, nivelDeGravedad, tiempoDeRespuesta);
    }

    @Override
        public String toString() {
            return "AccidenteVehicular{" +
                    "ubicacion='" + getUbicacion() + '\'' +
                    ", tipo='" + getTipoEmergencia() + '\'' +
                    ", gravedad=" + getNivelDeGravedad() +
                    ", tiempoDeRespuesta=" + getTiempoDeRespuesta() +
                    '}';
    }
    

}
