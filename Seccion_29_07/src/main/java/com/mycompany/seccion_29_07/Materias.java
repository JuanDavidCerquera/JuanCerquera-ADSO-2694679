/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seccion_29_07;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-2
 */
public class Materias {
        public void materia() {

      Scanner sc = new Scanner(System.in);
        System.out.println("escriba la cantidad de materias");
        int cantidadMaterias = sc.nextInt();
        for (int m = 0; m < cantidadMaterias; m++) {
            System.out.println("escriba la cantidad de tareas de esta materia");
            int cantidad = sc.nextInt();
            double notas[] = new double[cantidad];
            double valnota = 0;
            for (int i = 0; i < cantidad; i++) {
                System.out.println("escriba el valor de la nota:" + (i + 1));
                notas[i] = sc.nextDouble();
                valnota = valnota + notas[i];
            }
            valnota = valnota / cantidad;
            System.out.println("escriba el porcentaje de las notas");
            double porcNotas = (double) sc.nextInt() / 100;
                        System.out.println("escriba la cantidad de notas por tipologia de ");
            int cantidadnota = sc.nextInt();
            double notasExamen[] = new double[cantidadnota];
            double valnotaExam = 0;
            for (int i = 0; i < cantidad; i++) {
                System.out.println("escriba el valor de la nota:" + (i + 1));
                notasExamen[i] = sc.nextDouble();
                valnotaExam = valnotaExam + notasExamen[i];
            }
            valnotaExam= valnotaExam/cantidadnota;
            
            System.out.println("escriba el porcentaje del parcial");
            double porcExamen = (double) sc.nextInt() / 100;
            double promedioExamen = valnotaExam * porcExamen;
            double promedioTareas = valnota * porcNotas;
            double promedio = promedioExamen + promedioTareas;
            

            System.out.println("la definitiva de notas es: "+promedioTareas);
                        System.out.println("la definitiva de parcial es: "+promedioExamen);
            System.out.println("la nota definitiva es: "+ promedio);
        }


}
}