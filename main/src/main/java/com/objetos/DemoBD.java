package com.objetos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoBD {

    static final String BD_Conexion = "jdbc:mysql://localhost:3306/";
    static final String Usuario_BD = "root";
    static final String Contrasena_BD = "root";

    public static void main( String[] args ){

        try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
        Statement stmt = con.createStatement()){
            String query = "INSERT INTO POO.autos (puertas,marca,ceroKM,fecha_fabricacion) VALUES (3,'mercedes',0,'2004-07-07');";
            stmt.executeUpdate(query);
            // stmt.executeQuery(query); caso de uso con CREATE table
            System.out.println("Persistio en base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
