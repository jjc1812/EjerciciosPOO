package com.objetos;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ){
        AutoController autoController = new AutoController();

        autoController.getAutos();

        autoController.postAuto();
    }
}
