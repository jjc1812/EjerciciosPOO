package com.objetos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AutoController {
    
    public static void main( String[] args ){

        AutoService autoService = new AutoService();

        ArrayList<Auto> autosBase = autoService.getAutos();

        JSONObject auto = new JSONObject();

        int x = 0;
        while(x < autosBase.size() - 1) {

            JSONObject getAuto = new JSONObject();

            getAuto.put("marca", autosBase.get(x).getMarca());
            getAuto.put("puertas", autosBase.get(x).getPuertas());
            getAuto.put("CeroKM", autosBase.get(x).getCeroKM());
            getAuto.put("fechaFabricacion", autosBase.get(x).getFechaFabricacion());

            auto.put(x, getAuto);

            x++;
        }      

        JSONArray AutosList = new JSONArray();

        AutosList.add(auto);

        try(FileWriter file = new FileWriter("Autos.json")){
            file.write(AutosList.toJSONString());
            file.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
