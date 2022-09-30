package com.objetos;

import java.util.Scanner;

class DemoAuto {
    public static void main( String[] args ){
        Scanner input = new Scanner(System.in);

        Auto a = new Auto();
        System.out.println("Ingrese las puertas:");
        int inputPuerta = input.nextInt();
        System.out.println("Ingrese la marca:");
        String inputMarca = input.next();
        System.out.println("Ingrese la Si es 0KM:");
        boolean inputCeroKM = input.nextBoolean();
        System.out.println("Ingrese la fecha de fabricacion:");
        String inputFechaFabricacion = input.next();
        System.out.println("Ingrese la motor:");
        String inputMotor = input.next();
        System.out.println("Ingrese la color:");
        String inputColor = input.next();
        System.out.println("Ingrese la peso:");
        int inputPeso = input.nextInt();

        Auto a2 = new Auto(inputPuerta, inputMarca, inputCeroKM, inputFechaFabricacion, inputMotor, inputColor, inputPeso);
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

        input.close();
    }
}