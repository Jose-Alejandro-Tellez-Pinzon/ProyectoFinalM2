package UnidadesDeEmergencia;

public class Bomberos {

    private String estado;
    private String tipoUnidad;
    private int matricula; 
    private int capacidadDelTanqueDeAgua;
    private String equipamiento;
    private String sistemaDeBombeo;
    
    public int getCapacidadDelTanqueDeAgua() {
        return capacidadDelTanqueDeAgua;
    }

    public void setCapacidadDelTanqueDeAgua(int capacidadDelTanqueDeAgua) {
        this.capacidadDelTanqueDeAgua = capacidadDelTanqueDeAgua;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getSistemaDeBombeo() {
        return sistemaDeBombeo;
    }

    public void setSistemaDeBombeo(String sistemaDeBombeo) {
        this.sistemaDeBombeo = sistemaDeBombeo;
    }

    public Bomberos (String estado, String tipoUnidad, int matricula) {
        this.estado = estado;
        this.tipoUnidad = tipoUnidad;
        this.matricula = matricula;
    }

    public String responderLlamado() {
        return "La Unidad " + tipoUnidad + " está respondiendo al llamado.";
    }

    public String getasignarEmergencia (String unidadDisponible) {
        return this.estado = unidadDisponible;
    }

    public int getMatricula () {
        return this.matricula;
    }
}
