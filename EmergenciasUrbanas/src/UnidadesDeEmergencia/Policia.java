package UnidadesDeEmergencia;

public class Policia {

    private String estado;
    private String tipoUnidad;
    private int matricula; 
    private String armamentoAsignado;
    private int cantidadDeArmasAsignadas;

    public String getArmamentoAsignado() {
        return armamentoAsignado;
    }

    public void setArmamentoAsignado(String armamentoAsignado) {
        this.armamentoAsignado = armamentoAsignado;
    }

    public int getCantidadDeArmasAsignadas() {
        return cantidadDeArmasAsignadas;
    }

    public void setCantidadDeArmasAsignadas(int cantidadDeArmasAsignadas) {
        this.cantidadDeArmasAsignadas = cantidadDeArmasAsignadas;
    }

    public Policia (String estado, String tipoUnidad, int matricula) {
        this.estado = estado;
        this.tipoUnidad = tipoUnidad;
        this.matricula = matricula;
  }

      public String responderLlamado() {
        return "La unidad " + tipoUnidad + " está respondiendo al llamado.";
    }

    public String getdisponible (String enPatrullaje) {
        return this.estado = enPatrullaje;
    }

    public int getMatricula () {
        return this.matricula;
    }

}
