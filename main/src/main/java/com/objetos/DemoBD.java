package com.objetos;

public class DemoBD {

    public static void main( String[] args ){

        Auto a = new Auto();

        AutoDTO autoDTO = new AutoDTO();

        autoDTO.saveAuto(a.getPuertas(), a.getMarca(), a.getCeroKM(), a.getFechaFabricacion());
        autoDTO.getAutos();
    }
    
}
