package com.objetos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class DemoAuto {
    public static void main( String[] args ){
        Scanner input = new Scanner(System.in);

        ArrayList<Auto> autos = new ArrayList<Auto>();

        Map<Integer, Auto> autosMapping = new HashMap<Integer, Auto>();

        autos.add(new Auto());
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

        autos.add(new Auto(inputPuerta, inputMarca, inputCeroKM, inputFechaFabricacion, inputMotor, inputColor, inputPeso));
        Vehiculos a3 = new Auto(4, "ferrari", false, "10/07/1980", "V6", "rojo", 700);
        System.out.println(autos.get(0).toString());
        autos.get(0).modelo();
        autos.get(0).setPuertas(4);
        System.out.println(autos.get(0).getPuertas());
        System.out.println(autos.get(1).getMarca());
        autos.get(1).setMarca("Mercedes");
        System.out.println(autos.get(1).toString());
        autos.get(1).modelo();
        System.out.println(autos.get(1).pesoNeto(10));
        System.out.println(a3.toString());
        a3.patente();
        System.out.println("litros nafta: "+autos.get(1).cargarCombustible(10));

        for(int i = 0; i < autos.size(); i++){        

            switch(autos.get(i).getMarca()){
                case "ford":
                    System.out.println("es un ford");
                    break;
                case "ferrari":
                    System.out.println("es un ferrari");
                    break;
                case "Mercedes":
                    System.out.println("es un Mercedes");
                    break;
                default:
                    System.out.println("es un importado");
                    break;
            }

        }

        int x = 0;

        while(x < autos.size()){

            autosMapping.put(x, autos.get(x));
            System.out.println("get mapping normal:");
            System.out.println(autosMapping.get(x));
            System.out.println("get or default:");
            System.out.println(autosMapping.getOrDefault(4, new Auto()));

            x++;
        }

        // autosMapping.forEach((k,v)-> System.out.println("clave: " + k + " valor: " + v.toString()));

        autosMapping.remove(1);

        do{
            x++;
            System.out.println(x);
        } while(x < 10);

        input.close();
    }
}