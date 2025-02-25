package model.services;

import model.Emergencia;

public class Ambulancia extends ServicioBase {

    

    public Ambulancia (int id, int personal, int combustible) {
        super(id, personal, combustible);
    }

    @Override
    public void atenderEmergencia(Emergencia emergencia) {
       System.out.println("Atendiendo emergencia con ambulancia");
       System.out.println("La ambulancia " + getid() + " esta atendiendo la emergencia " + emergencia.getDescripcion());
       
       asignarPersonal(2);
       gastarcombustible(5);
    }

}
