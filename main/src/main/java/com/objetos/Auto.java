package com.objetos;

class Auto extends Vehiculos implements Combustible{
    private int puertas;
    private String marca;
    private boolean cerokm;
    private String fechaFabricacion;

    public Auto() {
        super();
        this.puertas = 5;
        this.marca = "ford";
        this.cerokm = false;
        this.fechaFabricacion = "1990-08-17";
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

    public Auto(
            int newPuerta, 
            String newMarca, 
            Boolean newCeroKM, 
            String newFechaFabricacion
        ){
        super();
        this.puertas = newPuerta;
        this.marca = newMarca;
        this.cerokm = newCeroKM;
        this.fechaFabricacion = newFechaFabricacion;
    }

    @Override
    public void patente() {
        System.out.println("ABC 123");
    }

    @Override
    public int cargarCombustible(int litrosCombustible) {
        if(litrosCombustible<CARGA_MAXIMA){
            return litrosCombustible;
        }
        return 0;
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

    public boolean getCeroKM(){
        return cerokm;
    }

    public String getFechaFabricacion(){
        return fechaFabricacion;
    }

    public void setPuertas(int newPuertas){
        this.puertas = newPuertas;
    }

    public void setMarca(String newMarca){
        this.marca = newMarca;
    }

    public void setFechaFabricacion(String newFechaFabricacion){
        this.fechaFabricacion = newFechaFabricacion;
    }

    public void setCeroKM(boolean newCeroKM){
        this.cerokm = newCeroKM;
    }

    public String toString(){
        return this.puertas + " " + this.marca + " " + this.cerokm + " " + this.fechaFabricacion + " " + this.motor + " " + this.color + " " + this.peso;
    }
}
