/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composiscion;

/**
 *
 * @author juan
 */
public class Composiscion {


    public static void main(String[] args) {
        Motor motorDelCoche = new Motor("Gasolina");
        Coche miCoche = new Coche("Toyota", "Camry", motorDelCoche);

        CocheView vistaCoche = new CocheView();
        CocheController controladorCoche = new CocheController(miCoche, vistaCoche);

        controladorCoche.arrancarCoche();
        controladorCoche.detenerCoche();
    }
}
   
