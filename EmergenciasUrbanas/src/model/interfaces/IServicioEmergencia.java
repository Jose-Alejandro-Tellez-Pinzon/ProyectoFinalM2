package model.interfaces;

import model.Emergencia;

public interface IServicioEmergencia {
    int getid();

    int getPesonalDisponible();

    int getCombustible();

    boolean estaDisponible();

    void asignarPersonal(int cantidad);

    void liberarPersonal(int cantidad);

    void gastarcombustible(int cantidad);

    void tanquearcombustible(int cantidad);

    void atenderEmergencia(Emergencia emergencia);
}
