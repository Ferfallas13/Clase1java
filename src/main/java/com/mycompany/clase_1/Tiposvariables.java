package com.mycompany.clase_1;

public class Tiposvariables {

    public static void main(String[] args) {
        //datos primitivos
        byte byentero = 40;
        short sentero = 12000;
        int entero = 12334;
        long lentero = 223333;
        //variable con decimales
        float decimal = 60.6f;
        double dodecimal = 7.999999;
        //variable caracter
        char caracter = 'q';
        boolean decision = true;
        //datos no primitivos
        Integer numero = 90;
        Integer num = null;
        String palabra = "Exitos en el curso";
        //datos constantes
        final int nume = 30;

        //imorime datos primitivos
        System.out.println("----------------------------");
        System.out.println("Imprime datos primitivos");
        System.out.println("El dato byte es: " + byentero);
        System.out.println("El dato short es:" + sentero);
        System.out.println("El dato entero es: " + entero);
        System.out.println("El dato long es:" + lentero);
        //imprime datos con decimales
        System.out.println("----------------------------");
        System.out.println("Imprime datos con decimal");
        System.out.println("El dato flotante es: " + decimal);
        System.out.println("El dato double es:" + dodecimal);
        //imprime caracteres
        System.out.println("----------------------------");
        System.out.println("imorime caracteres");
        System.out.println("El caracter es: " + caracter);
        System.out.println("El booleano es: " + decision);
        System.out.println("----------------------------");
        //imprime datos no primitivos
        System.out.println("----------------------------");
        System.out.println("Imprime datos no primitivos");
        System.out.println("Imprime datos no primitivos");
        System.out.println("El dato interger es: " + numero);
        System.out.println("El dato nulo es: " + num);
        System.out.println("La cadena es:" + palabra);
        //imprime datos constantes
        System.out.println("----------------------------");
        System.out.println("Datos constantes");
        System.out.println("El dato constante es:" + nume);

    }
}
