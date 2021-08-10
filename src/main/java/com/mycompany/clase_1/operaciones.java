package com.mycompany.clase_1;

import java.util.Scanner;

public class operaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//metodo para ingresar datos por teclado
        double valor, valor1, suma, resta, division, multiplicacion;
        String nombre;

        System.out.println("Digite el nombre de la persona");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el primer numero");
        valor = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero");
        valor1 = entrada.nextDouble();

        suma = valor + valor1;
        resta = valor - valor1;
        division = valor / valor1;
        multiplicacion = valor * valor1;

        System.out.println("El nombre es: "+nombre);
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La divicion es: " + division);
        System.out.println("La multiplicacion es: " + multiplicacion);
    }
}
