/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Modelo.Ciudad;
import Modelo.Pais;


/**
 *
 * @author SENA
 */
public class ProgramaPrincipal {
    public static void main(String[] args) {
        Ciudad ciudad = new Ciudad("Bogotá", "110110");
        Pais pais = new Pais("Colombia", 34567, ciudad );

        System.out.println("Pais: " + pais.getNombre());
        System.out.println("Poblacion: " + pais.getPoblacion());
        System.out.println("Ciudad: " + pais.getCiudad().getNombre()+ ", \nCodigo Postal: " + pais.getCiudad().getCodigoPostal());
    }
}
