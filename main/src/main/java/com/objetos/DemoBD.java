package com.objetos;

import java.util.Map;

public class DemoBD {

    public static void main( String[] args ){

        Auto a = new Auto();

        AutoDTO autoDTO = new AutoDTO();

        autoDTO.saveAuto(a.getPuertas(), a.getMarca(), a.getCeroKM(), a.getFechaFabricacion());
        Map<Integer, Auto> autosBase = autoDTO.getAutos();

        int x = 1;
        while(x < 5){
            System.out.println(autosBase.get(x).toString());
            x++;
        }
    }
    
}
