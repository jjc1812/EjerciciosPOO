package com.objetos;

import java.util.ArrayList;

public class AutoService {
    
    AutoDTO autoDTO = new AutoDTO();

    public int cantidadAutos(){
        ArrayList<Auto> autos = autoDTO.getAutos();
        return autos.size();
    }

    public ArrayList<Auto> getAutos(){
        ArrayList<Auto> autos = autoDTO.getAutos();
        return autos;
    }

    public void validateAndSaveAuto(Auto auto){
        if(auto.getPuertas() < 1){
            System.out.println("ERROR: los autos tienen una puerta como minimo.");
        } else {
            autoDTO.saveAuto(auto.getPuertas(), auto.getMarca(), auto.getCeroKM(), auto.getFechaFabricacion());
            System.out.println("OK");
        }
    }
}
