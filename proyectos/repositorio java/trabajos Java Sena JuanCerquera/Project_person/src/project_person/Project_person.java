package project_person;

import java.util.Scanner;

public class Project_person {

    public static void main(String[] args) {
        int contador = 0;
        Scanner scan = new Scanner(System.in);
        Persona persona1 = new Persona();
        System.out.println("----------------------------------------------");
        do {

            System.out.println("Menu:");
            System.out.println("1. Ver datos.");
            System.out.println("2. Actualizar los datos de la persona.");
            System.out.println("3. Calcular la edad de la persona.");
            System.out.println("4. Calcular el nivel de IMC(índice de masa corporal).");
            System.out.println("5.Finalizar programa.");
            contador = scan.nextInt();
            System.out.println("----------------------------------------------");
            switch (contador) {
                case 1:
                    System.out.println(persona1.Registro());
                    System.out.println("----------------------------------------------");
                    break;
                case 2:
                    System.out.println(persona1.Update());
                    System.out.println("----------------------------------------------");
                    break;
                case 3:
                    System.out.println("La edad de la persona es:");
                    System.out.println(persona1.edad() + " Años.");
                    System.out.println("----------------------------------------------");
                    break;
                case 4:
                    System.out.println("El nivel de IMC de la persona es: ");
                    System.out.println(persona1.level_imc() + ", IMC: " + persona1.imc());
                    System.out.println("----------------------------------------------");
                    break;
                case 5:
                    System.out.println("Programa finalizado.");
                    System.out.println("----------------------------------------------");
                    break;
            }
        } while (contador != 5);
        scan.close();
    }

}
