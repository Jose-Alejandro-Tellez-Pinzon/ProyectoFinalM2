public class Policia extends UnidadesEmergencia {
   
    public Policia() {
        super("Policia", "Disponible", "Patrulla", 85689324);
    }
sout.println("Hola");
    public void atenderEmergencia() {
        System.out.println("Atendiendo emergencia de tipo: " + obtenerTipo());
    }
}
