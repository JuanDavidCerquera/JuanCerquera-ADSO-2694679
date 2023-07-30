/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea;
import java.util.ArrayList;

public class NumeroVector {
    private ArrayList<Double> numeros;

    public NumeroVector() {
        numeros = new ArrayList<>();
    }

    public void agregarNumero(double numero) {
        numeros.add(numero);
    }

    public int contarPares() {
        int pares = 0;
        for (double numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    public int contarImpares() {
        int impares = 0;
        for (double numero : numeros) {
            if (numero % 2 != 0) {
                impares++;
            }
        }
        return impares;
    }

    public int contarNegativos() {
        int negativos = 0;
        for (double numero : numeros) {
            if (numero < 0) {
                negativos++;
            }
        }
        return negativos;
    }

    public int contarCeros() {
        int ceros = 0;
        for (double numero : numeros) {
            if (numero == 0) {
                ceros++;
            }
        }
        return ceros;
    }

    public int contarPositivos() {
        int positivos = 0;
        for (double numero : numeros) {
            if (numero > 0) {
                positivos++;
            }
        }
        return positivos;
    }

    public double obtenerNumeroMasAlto() {
        double masAlto = Double.MIN_VALUE;
        for (double numero : numeros) {
            if (numero > masAlto) {
                masAlto = numero;
            }
        }
        return masAlto;
    }

    public double obtenerNumeroMasBajo() {
        double masBajo = Double.MAX_VALUE;
        for (double numero : numeros) {
            if (numero < masBajo) {
                masBajo = numero;
            }
        }
        return masBajo;
    }

    public double[] obtenerVectorNumeros() {
        double[] vector = new double[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            vector[i] = numeros.get(i);
        }
        return vector;
    }
    
}
