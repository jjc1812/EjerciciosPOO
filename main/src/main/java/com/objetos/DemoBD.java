package com.objetos;

import java.util.ArrayList;
import java.util.Map;

public class DemoBD {

    public static void main( String[] args ){

        Auto a = new Auto(0, "volvo", false, "2002-02-02");
        Auto a1 = new Auto();
        AutoDTO autoDTO = new AutoDTO();

        AutoService autoService = new AutoService();

        autoService.validateAndSaveAuto(a);
        autoService.validateAndSaveAuto(a1);

        ArrayList<Auto> autosBase = autoDTO.getAutos();

        int x = 1;
        while(x < 5){
            System.out.println(autosBase.get(x).toString());
            x++;
        }
        System.out.println(autoService.cantidadAutos());
    }
    
}
