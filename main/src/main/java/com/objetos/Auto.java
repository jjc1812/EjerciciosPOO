package com.objetos;

class Auto {
    int puertas;
    String marca = "ford";
    private boolean cerokm = false;
    String fechaFabricacion = "23/04/1970";

    private int kilometraje() {
        return 10000;
    }

    public void modelo() {
        System.out.println("fiesta");
        System.out.println(marca);
        System.out.println(cerokm);
        System.out.println(kilometraje());
    }
}

class DemoAuto {
    public static void main( String[] args ){
        Auto a = new Auto();
        System.out.println(a.puertas);
        System.out.println(a.fechaFabricacion);
        a.modelo();
    }
}