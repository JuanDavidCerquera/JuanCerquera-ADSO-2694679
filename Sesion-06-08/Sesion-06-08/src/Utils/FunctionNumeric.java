/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author ariel
 */
public class FunctionNumeric {

    private Double numero;
    private int entero; 

    protected int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }
    public int InputEnteroScanner(String mensaje){
        InputEntero(mensaje, 1);
        return this.getEntero();
    }
        public int InputEnteroJOption(String mensaje){
        InputEntero(mensaje, 2);
        return this.getEntero();
    }
        
        
    private void InputEntero(String mensaje, int tipo) {
        Boolean validar = false;
        FunctionString fs = new FunctionString();

        //Validar que se ingrese el dato correcto
        while (validar == false) {
            try {
                if(tipo==1){
                    this.setEntero(Integer.parseInt(fs.InputScanner(mensaje)));
                }else{
                    this.setEntero(Integer.parseInt(fs.InputJOptionPane(mensaje)));
                }
                validar = true;
            } catch (Exception e) {
                if (tipo==1) {
                    fs.ShowScanner("Ha ingresado un dato no válido. ");
                }else{
                    fs.ShowJOptionPane("Ha ingresado un dato no válido. ");
                }
            }
        }        
    }
    public int InputEnteroRangeScanner(String mensaje, int min, int max){
        do {            
            InputEntero(mensaje,1);
        } while (this.getEntero() < min || this.getEntero() > max);
        
        return this.getEntero();
    }
        public int InputEnteroRangeJOption(String mensaje, int min, int max){
        do {            
            InputEntero(mensaje,2);
        } while (this.getEntero() < min || this.getEntero() > max);
        
        return this.getEntero();
    }
        public int InputEnteroJOptionPositivo(String mensaje){
        do {            
            InputEntero(mensaje,2);
        } while (this.getEntero() <0);
        
        return this.getEntero();
    }
        public int InputEnteroJOptionNegativo(String mensaje){
        do {            
            InputEntero(mensaje,2);
        } while (this.getEntero() >=0);
        
        return this.getEntero();
    }
        public int InputEnteroScannerPositivo(String mensaje){
        do {            
            InputEntero(mensaje,1);
        } while (this.getEntero() <0);
        
        return this.getEntero();
    }
        public int InputEnteroScannerNegativo(String mensaje){
        do {            
            InputEntero(mensaje,1);
        } while (this.getEntero() >=0);
        
        return this.getEntero();
    }
        
    

    protected Double getNumero() {
        return numero;
    }

    private void setNumero(Double numero) {
        this.numero = numero;
    }

    public Double InputNumericScanner(String mensaje) {
        InputNumeric(mensaje, 1);
        return this.getNumero();
    }

    public Double InputNumericJOptionPane(String mensaje) {
        InputNumeric(mensaje, 2);
        return this.getNumero();
    }
    
    private void InputNumeric(String mensaje, int tipo) {
        Boolean validar = false;
        FunctionString fs = new FunctionString();

        //Validar que se ingrese el dato correcto
        while (validar == false) {
            try {
                if(tipo==1){
                    this.setNumero(Double.parseDouble(fs.InputScanner(mensaje)));
                }else{
                    this.setNumero(Double.parseDouble(fs.InputJOptionPane(mensaje)));
                }
                validar = true;
            } catch (Exception e) {
                if (tipo==1) {
                    fs.ShowScanner("Ha ingresado un dato no válido. ");
                }else{
                    fs.ShowJOptionPane("Ha ingresado un dato no válido. ");
                }
            }
        }        
    }
    
    
    public Double InputNumericRangeScanner(String mensaje, Double min, Double max) {
        do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero() < min || this.getNumero() > max);
        
        return this.getNumero();
    }
    
    public Double InputNumericRangeJOptionPane(String mensaje, Double min, Double max) {
        do {            
            InputNumeric(mensaje,2);
        } while (this.getNumero() < min || this.getNumero() > max);
        
        return this.getNumero();
    }
        public Double InputNumericJOptionPanePositivos(String mensaje) {
        do {            
            InputNumeric(mensaje,2);
        } while (this.getNumero() < 0);
        
        return this.getNumero();
    }
            public Double InputNumericJOptionPaneNegativos(String mensaje) {
        do {            
            InputNumeric(mensaje,2);
        } while (this.getNumero() >= 0);
        
        return this.getNumero();
    }
            
        public Double InputNumericScannerPositivo(String mensaje) {
        do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero() < 0);
        
        return this.getNumero();
    }
            public Double InputNumericScannerNegativo(String mensaje) {
        do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero() >=0);
        
        return this.getNumero();
    }
            
            
}
