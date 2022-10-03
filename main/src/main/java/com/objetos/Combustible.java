package com.objetos;

public interface Combustible {
    static int CARGA_MAXIMA = 1000;

    public abstract int cargarCombustible(int litrosCombustible);
}
