package model.services;

import model.Emergencia;

public class Policia extends ServicioBase{

    public Policia(int id, int personal, int combustible) {
        super(id, personal, combustible);
    }

    @Override
    public void atenderEmergencia(Emergencia emergencia) {
        System.out.println("Atendiendo emergencia con pratrullas");
        System.out.println("La patrulla " + getid() + " esta atendiendo la emergencia " + emergencia.getDescripcion());
        
        asignarPersonal(2);
        gastarcombustible(5);
    }

}
