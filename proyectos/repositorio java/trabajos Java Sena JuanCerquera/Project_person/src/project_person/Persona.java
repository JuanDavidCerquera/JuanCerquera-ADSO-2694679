package project_person;

import java.time.LocalDate;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private double peso;
    private double altura;
    private Scanner scan = new Scanner(System.in);

    public Persona() {
        System.out.println("Ingrese los siguientes datos:");
        System.out.print("Nombre:");
        this.nombre = scan.next();
        System.out.print("Apellido:");
        this.apellido = scan.next();
        System.out.println("Fecha de nacimiento.");
        System.out.print("Dia:");
        int dia = scan.nextInt();
        System.out.print("Mes:");
        int mes = scan.nextInt();
        System.out.print("Año:");
        int año = scan.nextInt();
        this.fecha_nacimiento = LocalDate.of(año, mes, dia);
        System.out.println("Peso(Kg):");
        this.peso = scan.nextDouble();
        System.out.println("Altura(m):");
        this.altura = scan.nextDouble();
    }

    public String Registro() {
        return "Nombre: " + this.nombre + "\n"
                + "Apellido: " + this.apellido + "\n"
                + "Fecha de nacimiento: " + this.fecha_nacimiento + "\n"
                + "Peso: " + this.peso + "\n"
                + "Altura: " + this.altura;

    }

    public String Update() {
        System.out.println("Ingrese los nuevos datos:");
        System.out.print("Nombre:");
        this.nombre = scan.next();
        System.out.print("Apellido:");
        this.apellido = scan.next();
        System.out.println("Fecha de nacimiento.");
        System.out.print("Dia:");
        int dia = scan.nextInt();
        System.out.print("Mes:");
        int mes = scan.nextInt();
        System.out.print("Año:");
        int año = scan.nextInt();
        this.fecha_nacimiento = LocalDate.of(año, mes, dia);
        System.out.println("Peso(Kg):");
        this.peso = scan.nextDouble();
        System.out.println("Altura(m):");
        this.altura = scan.nextDouble();
        return "Datos actualizados.";
    }

    public int edad() {
        LocalDate hoy = LocalDate.now();
        int edad = hoy.getYear() - fecha_nacimiento.getYear();
        return edad;
    }

    public double imc() {
        double imc = peso / (Math.pow(altura, 2));
        return imc;
    }

    public String level_imc() {
        double imc = peso / (Math.pow(altura, 2));
        if (imc < 16) {
            return "DPC grado III";
        } else if (imc < 16.9) {
            return "DPC grado II";
        } else if (imc < 18.4) {
            return "DPC grado I";
        } else if (imc < 24.9) {
            return "Peso normal.";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 39.9) {
            return "Obesidad";
        } else {
            return "Obesidad mórbida";
        }
    }
}
