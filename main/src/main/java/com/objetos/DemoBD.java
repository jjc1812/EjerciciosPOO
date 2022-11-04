package com.objetos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoBD {

    static final String BD_Conexion = "jdbc:mysql://localhost:3306/";
    static final String Usuario_BD = "root";
    static final String Contrasena_BD = "root";

    public static void main( String[] args ){

        int puertas = 5;
        String marca = "ford";
        int ceroKM = 1;
        String fechaFabricacion = "2022-07-07";

        try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
        Statement stmt = con.createStatement()){
            String query = "INSERT INTO POO.autos (puertas,marca,ceroKM,fecha_fabricacion) VALUES (" + puertas + ",'" + marca + "'," + ceroKM + ",'" + fechaFabricacion + "');";
            stmt.executeUpdate(query);

            System.out.println("Persistio en base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
        Statement stmt = con.createStatement()){
            String query = "select * from poo.autos a ;";
            ResultSet result = stmt.executeQuery(query);
            while(result.next()){
                int puertaBD = result.getInt("puertas");
                String marcaBD = result.getString("marca");
                Boolean ceroKMBD = result.getBoolean("ceroKM");
                Date fechaFabricacionBD = result.getDate("fecha_fabricacion");
                System.out.println("puertas: " + puertaBD +
                " marca: " + marcaBD +
                " ceroKM: " + ceroKMBD +
                " fechaFabricacion: " + fechaFabricacionBD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
