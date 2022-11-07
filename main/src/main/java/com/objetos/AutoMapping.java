package com.objetos;

import java.sql.Date;

public class AutoMapping {
    
    public Auto mapAuto(int puertaBD, String marcaBD, Boolean ceroKMBD, Date fechaFabricacionBD) {
        Auto auto = new Auto(puertaBD, marcaBD, ceroKMBD, fechaFabricacionBD.toString());
        return auto;
    }
}
