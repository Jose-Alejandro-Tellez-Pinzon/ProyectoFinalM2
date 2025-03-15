package Emergencias;

import utils.Gravedad;

public class Emergencia {

    private String ubicacion;
    private String tipoEmergencia;
    private Gravedad nivelDeGravedad;
    private int tiempoDeRespuesta;

    public Emergencia(String ubicacion, String tipoEmergencia, Gravedad nivelDeGravedad, int tiempoDeRespuesta) {
        this.ubicacion = ubicacion;
        this.tipoEmergencia = tipoEmergencia;
        this.nivelDeGravedad = nivelDeGravedad;
        this.tiempoDeRespuesta = tiempoDeRespuesta;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getTipoEmergencia() {
        return tipoEmergencia;
    }

    public Gravedad getNivelDeGravedad() {
        return nivelDeGravedad;
    }

    public int getTiempoDeRespuesta() {
        return tiempoDeRespuesta;
    }

    @Override
    public String toString() {

        return "Emergencia{" +
                "ubicacion='" + ubicacion + '\'' +
                ", tipo='" + tipoEmergencia + '\'' +
                ", gravedad=" + nivelDeGravedad +
                ", tiempoDeRespuesta=" + tiempoDeRespuesta +
                '}';
     //   return "Emergencia [ubicacion=" + ubicacion + ", tipoEmergencia=" + tipoEmergencia + ", nivelDeGravedad="
       //         + nivelDeGravedad + ", tiempoDeRespuesta=" + tiempoDeRespuesta + "]";
    }


    

}
