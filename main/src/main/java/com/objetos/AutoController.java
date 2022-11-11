package com.objetos;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AutoController {
    
    public static void main( String[] args ){
        JSONObject getAuto = new JSONObject();

        getAuto.put("marca", "mercedes");
        getAuto.put("puertas", 5);
        getAuto.put("CeroKM", false);
        getAuto.put("fechaFabricacion", "02/02/2002");

        JSONObject autos = new JSONObject();

        autos.put("auto", getAuto);

        JSONArray AutosList = new JSONArray();

        AutosList.add(autos);

        try(FileWriter file = new FileWriter("Autos.json")){
            file.write(AutosList.toJSONString());
            file.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
