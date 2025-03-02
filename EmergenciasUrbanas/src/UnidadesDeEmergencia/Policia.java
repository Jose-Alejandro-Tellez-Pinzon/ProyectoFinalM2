package UnidadesDeEmergencia;

public class Policia implements Responder{

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

    @Override
    public void atenderEmergencia() {
        System.out.println("La policía está respondiendo a una emergencia de seguridad.");
    }

    @Override
    public void evaluarEstado() {
        System.out.println("Evaluando la seguridad de la zona y situación del incidente.");
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
