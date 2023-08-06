/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Utils.FunctionNumeric;
import Utils.FunctionProblemas;
import Utils.FunctionString;

/** 
 *
 * @author ariel
 */
public class Mostrar {
    public static void main(String[] args) {
        FunctionString fs = new FunctionString();
        FunctionNumeric fn = new FunctionNumeric();
        FunctionProblemas fp = new FunctionProblemas();
        
        
        
        fp.CelsiusFahrenheit(fn.InputNumericScanner("digite los grados en celsius para pasar a Fahrenheit"));
        fp.CelsiusKelvin(fn.InputNumericScanner("digite los grados en celsius para pasar a Kelvin"));
        fp.FahrenheitCelsius(fn.InputNumericScanner("digite los grados en Fahrenheit para pasar a Celsius"));
        fp.Fahrenheitkelvin(fn.InputNumericScanner("digite los grados en Fahrenheit para pasar a Kelvin"));
        fp.kelvinFahrenheit(fn.InputNumericScanner("digite los grados en kelvin para pasar a Fahrenheit"));
        fp.kelvinCelsius(fn.InputNumericScanner("digite los grados en kelvin para pasar a Celsius"));
        

    }
}
