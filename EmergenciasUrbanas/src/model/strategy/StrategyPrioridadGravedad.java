package model.strategy;

import model.Emergencia;

public class StrategyPrioridadGravedad implements StrategyPrioridad {

    @Override
    public int calcularPrioridad(Emergencia emergencia) {

        switch (emergencia.getNivelDeGravedad()) {

            case BAJA:

                return 1;

            case MEDIA:

                return 2;

            case ALTA:

                return 3;

            default:
                return 1;
        }

        
    }

  

}
