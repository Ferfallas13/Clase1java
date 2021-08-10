package com.mycompany.clase_1;

import javax.swing.JOptionPane;

public class Entrada {

    public static void main(String[] args) {
        double valor1, valor2, suma, resta, multiplicacion, division;
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor: "));

        suma = valor1 + valor2;
        resta = valor1 - valor2;
        multiplicacion = valor1 * valor2;
        division = valor1 / valor2;

        System.out.println("------------------------------");
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
        JOptionPane.showMessageDialog(null, "La resta es: " + resta);
        JOptionPane.showMessageDialog(null, "La multiplicion es: " + multiplicacion);
        JOptionPane.showMessageDialog(null, "La divicion es: " + division);

        System.out.println("------------------------------");
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicaion es: " + multiplicacion);
        System.out.println("La division es: " + division);
        System.out.println("------------------------------");
    }
}
