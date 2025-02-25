package model.services;

import model.Emergencia;

public class Bomberos extends ServicioBase {

    public Bomberos(int id, int personal, int combustible) {
        super(id, personal, combustible);
    }

    @Override
    public void atenderEmergencia(Emergencia emergencia) {
        System.out.println("Atendiendo emergencia con camiones de bomberos");
       System.out.println("El cambion " + getid() + " esta atendiendo la emergencia " + emergencia.getDescripcion());
       
       asignarPersonal(5);
       gastarcombustible(7);
    }

}
