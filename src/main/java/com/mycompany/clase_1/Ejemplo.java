package com.mycompany.clase_1;

import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double participacion;
        
        System.out.println("Ingrese el nombre de la persona");
        nombre=entrada.nextLine();
        System.out.println("Ingrese la nota de participacion");
        participacion=entrada.nextDouble();
        
        participacion*=0.20;
        
        System.out.println("El estudiante "+nombre+" tiene una participacion de "+participacion);

    }
}
