package com.objetos;

class Auto extends Vehiculos{
    private int puertas;
    private String marca;
    private boolean cerokm;
    private String fechaFabricacion;

    public Auto() {
        super();
        this.puertas = 5;
        this.marca = "ford";
        this.cerokm = false;
        this.fechaFabricacion = "17/08/1990";
    }

    public Auto(
            int newPuerta, 
            String newMarca, 
            Boolean newCeroKM, 
            String newFechaFabricacion, 
            String newMotor, 
            String newColor, 
            int newPeso
        ){
        super(newMotor, newColor, newPeso);
        this.puertas = newPuerta;
        this.marca = newMarca;
        this.cerokm = newCeroKM;
        this.fechaFabricacion = newFechaFabricacion;
    }

    private int kilometraje(boolean ceroKM) {
        if(ceroKM){
            return 0;
        } else {
            return 10000;
        }
    }

    public void modelo() {
        System.out.println(kilometraje(cerokm));
    }

    public int getPuertas() {
        return puertas;
    }

    public String getMarca(){
        return marca;
    }

    public void setPuertas(int newPuertas){
        this.puertas = newPuertas;
    }

    public void setMarca(String newMarca){
        this.marca = newMarca;
    }

    public String toString(){
        return this.puertas + " " + this.marca + " " + this.cerokm + " " + this.fechaFabricacion + " " + this.motor + " " + this.color + " " + this.peso;
    }
}

class DemoAuto {
    public static void main( String[] args ){
        Auto a = new Auto();
        Auto a2 = new Auto(3, "fiat", true, "20/05/2022", "1.6", "gris", 900);
        Vehiculos a3 = new Auto(4, "ferrari", false, "10/07/1980", "V6", "rojo", 700);
        System.out.println(a.toString());
        a.modelo();
        a.setPuertas(4);
        System.out.println(a.getPuertas());
        System.out.println(a2.getMarca());
        a2.setMarca("Mercedes");
        System.out.println(a2.toString());
        a2.modelo();
        System.out.println(a2.pesoNeto(10));
        System.out.println(a3.toString());
    }
}