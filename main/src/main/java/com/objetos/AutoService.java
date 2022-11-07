package com.objetos;

import java.util.Map;

public class AutoService {
    
    AutoDTO autoDTO = new AutoDTO();

    public int cantidadAutos(){
        Map<Integer, Auto> autos = autoDTO.getAutos();
        return autos.size();
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
