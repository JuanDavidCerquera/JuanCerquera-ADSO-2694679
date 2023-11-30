/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composiscion;

/**
 *
 * @author juan
 */
class Motor {
    private String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public void encender() {
        System.out.println("Encendiendo el motor " + tipo);
    }

    public void apagar() {
        System.out.println("Apagando el motor " + tipo);
    }
}

class Coche {
    private String marca;
    private String modelo;
    private Motor motor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Coche(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void arrancar() {
        System.out.println("Arrancando el coche " + marca + " " + modelo);
        motor.encender();
    }

    public void detener() {
        System.out.println("Deteniendo el coche " + marca + " " + modelo);
        motor.apagar();
    }
}
