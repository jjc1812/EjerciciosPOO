package com.objetos;

public class Auto {
    int puertas;
    String marca = "ford";
    boolean cerokm = false;
    String fechaFabricacion = "23/04/1970";

    int kilometraje() {
        return 10000;
    }

    void modelo() {
        System.out.println("fiesta");
        System.out.println(marca);
    }
}

class DemoAuto {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.modelo();
        System.out.println(a.kilometraje());
    }
}