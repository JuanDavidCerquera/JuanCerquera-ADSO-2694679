/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Entity.ConversionMoneda.ConversionMoneda;
import Utils.FunctionNumeric;
import Entity.Grados.FunctionProblemas;
import Utils.FunctionString;

/** 
 *
 * @author ariel
 */
public class Mostrar {
    public static void main(String[] args) {
        //FunctionString fs = new FunctionString();
        //FunctionNumeric fn = new FunctionNumeric();
        //FunctionProblemas fp = new FunctionProblemas();
        ConversionMoneda cm = new ConversionMoneda();
        
        
        //fp.CelsiusFahrenheit();
        //fp.CelsiusKelvin();
        //fp.FahrenheitCelsius();
        //fp.Fahrenheitkelvin();
        //fp.kelvinFahrenheit();
        //fp.kelvinCelsius();
        cm.ConversionPesosColombianos();
        

    }
}
