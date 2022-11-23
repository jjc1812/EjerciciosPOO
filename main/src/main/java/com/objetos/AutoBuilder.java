package com.objetos;

import org.json.simple.JSONObject;

public class AutoBuilder {
    public Auto builderAuto(JSONObject object){
        JSONObject auto = (JSONObject) object.get("auto");
        Long puertas = (Long) auto.get("puertas");
        String marca = (String) auto.get("marca");
        boolean ceroKM = (boolean) auto.get("CeroKM");
        String fechaFabricacion = (String) auto.get("fechaFabricacion");
        
        Auto resultAuto = new Auto(puertas.intValue(), marca, ceroKM, fechaFabricacion);
        return resultAuto;
    }
}
