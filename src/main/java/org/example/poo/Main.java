package org.example.poo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        // Crear objeto
        Coche miCoche = new Coche();
        miCoche.marca = "Toyota";
        miCoche.modelo = "Corolla";
        miCoche.anio = 2021;
        miCoche.encender(); // El coche está encendido.
        System.out.println("HOLAAA MUNDO");
    }
}