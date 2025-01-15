public class UnidadesEmergencia {

    private String nombre;
    private String estado;
    private String tipoUnidad;
    private int matricula;
    
    
    

    public UnidadesEmergencia(String nombre, String estado, String tipoUnidad, int matricula) {
        this.nombre = nombre;
        this.estado = estado;
        this.tipoUnidad = tipoUnidad;
        this.matricula = matricula;
    }

    public String responderLlamado() {
        return "Unidad " + nombre + " está respondiendo al llamado.";
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
    
    
    public String obtenerEstado() {
        return this.estado;
    }

    public String asignarEmergencia() {
        return "Unidad " + nombre + " está asignada a una emergencia.";
    }

    public String registrarInforme() {
        return "Unidad " + nombre + " está registrando un informe.";
    }

    



}
