package model.observer;

import model.Emergencia;

public interface SujetoEmergencias {

    void agregarObservador(ObserverEmergencias observador);

    void eliminarObservador(ObserverEmergencias observador);

    void notificarEmergencia(Emergencia emergencia);

}
