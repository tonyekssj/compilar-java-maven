package org.mipruebamaven;

public class Prueba {
    private String mi_nombre;
    private int mi_edad;

    Prueba(String nombre,int edad){
        mi_nombre=nombre;
        mi_edad=edad;
    }

    String GetNombre(){
        return mi_nombre;
    }

    int GetEdad(){
        return mi_edad;
    }
}

