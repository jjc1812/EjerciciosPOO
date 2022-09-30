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
