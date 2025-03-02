package UnidadesDeEmergencia;

public class Ambulancia implements Responder {
    ;
    private int id;
    private boolean estado;
    private String tipoUnidad;
    private String equipoMedico;
    private boolean funcionamientoDelSistemaDeEmergencia;
    private int combustible;

    public Ambulancia() {

        id = 285693;
        estado = true;
        tipoUnidad = "Ambulancia";
        equipoMedico = "Desfibrilador, Botiquin, Camilla";
        funcionamientoDelSistemaDeEmergencia = true;
        combustible = 80;
    }

    public Ambulancia(boolean estado, boolean funcionamientoDelSistemaDeEmergencia) {
        this.estado = estado;
        this.funcionamientoDelSistemaDeEmergencia = funcionamientoDelSistemaDeEmergencia;
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("La ambulancia está atendiendo una emergencia médica.");
    }

    @Override
    public void evaluarEstado() {
        System.out.println("Evaluando estado de los heridos y brindando atención médica.");
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isFuncionamientoDelSistemaDeEmergencia() {
        return funcionamientoDelSistemaDeEmergencia;
    }

    public void setFuncionamientoDelSistemaDeEmergencia(boolean funcionamientoDelSistemaDeEmergencia) {
        this.funcionamientoDelSistemaDeEmergencia = funcionamientoDelSistemaDeEmergencia;
    }



    

    public void combustibleRestante(int resta) {
       
        combustible = combustible - resta;
    }


    public void Funcionamiento(){

        if (estado == true) {
            System.out.println("La ambulancia esta en servicio");
        } else {
            System.out.println("La ambulancia no esta en servicio");
        }

    }


    public void volverEstado(boolean estado) {
        if (estado == false) {
            System.out.println("La ambulancia no esta en servicio");
        } else {
            System.out.println("La ambulancia esta en servicio");
        }
    }


    @Override
    public String toString() {
        return "Ambulancia [Id: " + id + ", Estado: " + estado + ", Tipo unidad: " + tipoUnidad + ", Equipo medico: "
                + equipoMedico + ", Funcionamiento del sistema de emergencia: " + funcionamientoDelSistemaDeEmergencia
                + ", combustible: " + combustible + " estado: " + estado + "]";
    }


}
