/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumeroVector numeroVector = new NumeroVector();

        System.out.println("Ingrese números reales (escriba 'fin' para terminar):");

        while (true) {
            String input = scanner.next();

            if (input.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                double numero = Double.parseDouble(input);
                numeroVector.agregarNumero(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Ingrese un número válido o 'fin' para terminar.");
            }
        }

        System.out.println("Números pares: " + numeroVector.contarPares());
        System.out.println("Números impares: " + numeroVector.contarImpares());
        System.out.println("Números negativos: " + numeroVector.contarNegativos());
        System.out.println("Números ceros: " + numeroVector.contarCeros());
        System.out.println("Números positivos: " + numeroVector.contarPositivos());
        System.out.println("Número más alto: " + numeroVector.obtenerNumeroMasAlto());
        System.out.println("Número más bajo: " + numeroVector.obtenerNumeroMasBajo());

        // Obtener el vector de números y mostrarlo en una línea horizontal
        
        double[] vectorNumeros = numeroVector.obtenerVectorNumeros();
        System.out.print("Vector de números: ");
        for (double numero : vectorNumeros) {
            System.out.print(numero + " ");
        }
    }
}
