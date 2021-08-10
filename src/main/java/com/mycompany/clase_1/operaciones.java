package com.mycompany.clase_1;

import java.util.Scanner;

public class operaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//metodo para ingresar datos por teclado
        double valor1, valor2, suma, resta, division, multiplicacion;
        String nombre;

        System.out.println("Digite el nombre de la persona");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el primer numero");
        valor1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero");
        valor2 = entrada.nextDouble();

        suma = valor1 + valor2;
        resta = valor1 - valor2;
        division = valor1 / valor2;
        multiplicacion = valor1 * valor2;

        System.out.println("El nombre es: "+nombre);
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La divicion es: " + division);
        System.out.println("La multiplicacion es: " + multiplicacion);
    }
}
