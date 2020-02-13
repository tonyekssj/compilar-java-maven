package org.mipruebamaven;

public class Main {

    public static void main(String[] args){
        String nombre;
        int edad;
        Prueba alumno = new Prueba(nombre= "Hong", edad= 23);
        System.out.println("Nombre= "+alumno.GetNombre());
        System.out.println("Edad= "+alumno.GetEdad());
    }
}