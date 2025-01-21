package UnidadesDeEmergencia;

public class Ambulancia {
;
    private int id;
    private String estado;
    private String tipoUnidad;
    private int matricula; 
    private String equipoMedico;
    private int capacidadDePacientes;
    private String funcionamientoDelSistemaDeEmergencia;

    public String getEquipoMedico() {
        return equipoMedico;
    }

    public void setEquipoMedico(String equipoMedico) {
        this.equipoMedico = equipoMedico;
    }

    public int getCapacidadDePacientes() {
        return capacidadDePacientes;
    }

    public void setCapacidadDePacientes(int capacidadDePacientes) {
        this.capacidadDePacientes = capacidadDePacientes;
    }

    public String getFuncionamientoDelSistemaDeEmergencia() {
        return funcionamientoDelSistemaDeEmergencia;
    }

    public void setFuncionamientoDelSistemaDeEmergencia(String funcionamientoDelSistemaDeEmergencia) {
        this.funcionamientoDelSistemaDeEmergencia = funcionamientoDelSistemaDeEmergencia;
    }

    public Ambulancia (int id,String estado, String tipoUnidad, int matricula) {
        this.id = id;
        this.estado = estado;
        this.tipoUnidad = tipoUnidad;
        this.matricula = matricula;
    }

    public String responderLlamado() {
        return "Unidad " + id + " está respondiendo al llamado.";
    }

    public String getactualizarEstado (String nuevoEstado) {
        return this.estado = nuevoEstado;
    }

    public String getasignarEmergencia () {
        return "Se asigno la emergencia a la unidad" + tipoUnidad;
    }

    public int getMatricula () {
        return this.matricula;
    }

}

