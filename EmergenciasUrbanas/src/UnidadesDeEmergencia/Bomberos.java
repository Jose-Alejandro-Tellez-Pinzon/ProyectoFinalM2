package UnidadesDeEmergencia;

public class Bomberos implements Responder{

    private int id;
    private boolean estado;
    private String tipoUnidad;
    private int capacidadDelTanqueDeAgua;
    private String equipamiento;
    private int combustible;
   

    

    public Bomberos() {
        id = 946572;
        estado = true;
        tipoUnidad = "Bomberos";
        capacidadDelTanqueDeAgua = 15000;
        equipamiento = "Mangueras, Hacha, Casco, Botas";
        combustible = 4000;
    }



    public Bomberos(boolean estado, int capacidadDelTanqueDeAgua, int combustible) {
        this.estado = estado;
        this.capacidadDelTanqueDeAgua = capacidadDelTanqueDeAgua;
        this.combustible = combustible;
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Los bomberos están apagando un incendio.");
    }

    @Override
    public void evaluarEstado() {
        System.out.println("Evaluando daños y propagación del incendio.");
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

    public int getCombustible() {
        return combustible;
    }

}
