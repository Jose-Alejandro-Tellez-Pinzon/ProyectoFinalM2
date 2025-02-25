package model;

import utils.Niveles;

public abstract class Emergencia {

    private String ubicacion;
    private String tipoEmergencia;
    private Niveles nivelDeGravedad;
    private int tiempoDeRespuesta;
    private boolean atendida;
    private Niveles distanciaDeBase;
    private long tiempoInicioAtencion;
    private long tiempoFinAtencion;

    public Emergencia(String ubicacion, String tipoEmergencia, Niveles nivelDeGravedad, int tiempoDeRespuesta,
            Niveles distanciaDeBase) {
        this.ubicacion = ubicacion;
        this.tipoEmergencia = tipoEmergencia;
        this.nivelDeGravedad = nivelDeGravedad;
        this.tiempoDeRespuesta = tiempoDeRespuesta;
        this.distanciaDeBase = distanciaDeBase;
        this.atendida = false;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoEmergencia() {
        return tipoEmergencia;
    }

    public void setTipoEmergencia(String tipoEmergencia) {
        this.tipoEmergencia = tipoEmergencia;
    }

    public Niveles getNivelDeGravedad() {
        return nivelDeGravedad;
    }

    public void setNivelDeGravedad(Niveles nivelDeGravedad) {
        this.nivelDeGravedad = nivelDeGravedad;
    }

    public int getTiempoDeRespuesta() {
        return tiempoDeRespuesta;
    }

    public void setTiempoDeRespuesta(int tiempoDeRespuesta) {
        this.tiempoDeRespuesta = tiempoDeRespuesta;
    }

    public boolean isAtendida() {
        return atendida;
    }

    public void setAtendida(boolean atendida) {
        this.atendida = atendida;
    }

    public Niveles getDistanciaDeBase() {
        return distanciaDeBase;
    }

    public void setDistanciaDeBase(Niveles distanciaDeBase) {
        this.distanciaDeBase = distanciaDeBase;
    }

    public long getTiempoInicioAtencion() {
        return tiempoInicioAtencion;
    }

    public void setTiempoInicioAtencion(long tiempoInicioAtencion) {
        this.tiempoInicioAtencion = tiempoInicioAtencion;
    }

    public long getTiempoFinAtencion() {
        return tiempoFinAtencion;
    }

    public void setTiempoFinAtencion(long tiempoFinAtencion) {
        this.tiempoFinAtencion = tiempoFinAtencion;
    }

    public void iniciarAtencion() {
        this.tiempoInicioAtencion = System.currentTimeMillis();
    }

    public void finalizarAtencion() {
        this.tiempoFinAtencion = System.currentTimeMillis();
        this.atendida = true;
    }

    public long calcularTiempoAtencion() {
        return (tiempoFinAtencion - tiempoInicioAtencion);
    }

    public String getDescripcion() {
        return String.format("%s en %s (gravedad: %s)", tipoEmergencia, ubicacion, nivelDeGravedad);
    }

    public String toString() {
        return getDescripcion() + "tiempo estimado de respuesta: " + tiempoDeRespuesta + " minutos";
    }

}
