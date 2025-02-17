package UnidadesDeEmergencia;

public class Policia {

    private int id;
    private boolean estado;
    private String tipoUnidad;
    private String armamentoAsignado;
    private int cantidadDeArmasAsignadas;

    public Policia(int id, boolean estado, String tipoUnidad, String armamentoAsignado, int cantidadDeArmasAsignadas) {
        this.id = id;
        this.estado = estado;
        this.tipoUnidad = tipoUnidad;
        this.armamentoAsignado = armamentoAsignado;
        this.cantidadDeArmasAsignadas = cantidadDeArmasAsignadas;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTipoUnidad() {
        return tipoUnidad;
    }

    public void setTipoUnidad(String tipoUnidad) {
        this.tipoUnidad = tipoUnidad;
    }

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

}
