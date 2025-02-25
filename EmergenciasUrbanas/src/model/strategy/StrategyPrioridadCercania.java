package model.strategy;

import model.Emergencia;

public class StrategyPrioridadCercania implements StrategyPrioridad {


    public int calcularDistanciaDeBase(Emergencia emergencia) {

        switch (emergencia.getDistanciaDeBase()) {

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

    @Override
    public int calcularPrioridad(Emergencia emergencia) {
        return 3 - calcularDistanciaDeBase(emergencia);
    }

}
