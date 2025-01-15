public class Emergencia {

    private String tipo;
    private String ubicacion;
    private int nivelGravedad;
    private int tiempoRespuesta;

    public Emergencia(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.nivelGravedad = nivelGravedad;
        this.tiempoRespuesta = tiempoRespuesta;
    }

    // Método para obtener el tipo de emergencia
    public String obtenerTipo() {
        return this.tipo;
    }

    // Método para establecer el tipo de emergencia
    public void establecerTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método para obtener la ubicación de la emergencia
    public String obtenerUbicacion() {
        return this.ubicacion;
    }

    // Método para establecer la ubicación de la emergencia
    public void establecerUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Método para obtener el nivel de gravedad de la emergencia
    public int obtenerNivelGravedad() {
        return this.nivelGravedad;
    }

    // Método para establecer el nivel de gravedad de la emergencia
    public void establecerNivelGravedad(int nivelGravedad) {
        this.nivelGravedad = nivelGravedad;
    }

    // Método para obtener el tiempo de respuesta de la emergencia
    public int obtenerTiempoRespuesta() {
        return this.tiempoRespuesta;
    }

    // Método para establecer el tiempo de respuesta de la emergencia
    public void establecerTiempoRespuesta(int tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;

    }
}
