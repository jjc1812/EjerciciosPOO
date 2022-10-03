package com.objetos;

public abstract class Vehiculos {
    protected String motor;
    protected String color;
    protected int peso;

    public Vehiculos(){
        this.motor = "V8";
        this.color = "negro";
        this.peso = 1000;
    }

    public Vehiculos(String newMotor, String newColor, int newPeso){
        this.motor = newMotor;
        this.color = newColor;
        this.peso = newPeso;
    }

    public int pesoNeto(int pesoCarga){
        return pesoCarga+peso;
    }

    public abstract void patente();
}
