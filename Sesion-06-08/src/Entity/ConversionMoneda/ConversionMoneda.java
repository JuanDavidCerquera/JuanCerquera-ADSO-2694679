/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity.ConversionMoneda;

import Utils.FunctionNumeric;
import Utils.FunctionString;

/**
 *
 * @author Ambiente 209-2
 */
public class ConversionMoneda {
    
    
    public double pesosColombianos;
    public double Dolares;
    public double bolivares;
    public double soles;
    public double francos;
    public double pesetas;
   FunctionNumeric fn = new FunctionNumeric();
   FunctionString fs = new FunctionString();

    public double getPesetas() {
        return pesetas;
    }

    public void setPesetas(double pesetas) {
        this.pesetas = pesetas;
    }
   

    public double getPesosColombianos() {
        return pesosColombianos;
    }

    public void setPesosColombianos(double pesosColombianos) {
        this.pesosColombianos = pesosColombianos;
    }

    public double getDolares() {
        return Dolares;
    }

    public void setDolares(double Dolares) {
        this.Dolares = Dolares;
    }

    public double getBolivares() {
        return bolivares;
    }

    public void setBolivares(double bolivares) {
        this.bolivares = bolivares;
    }

    public double getSoles() {
        return soles;
    }

    public void setSoles(double soles) {
        this.soles = soles;
    }

    public double getFrancos() {
        return francos;
    }

    public void setFrancos(double francos) {
        this.francos = francos;
    }
    
    
    
    public void ConversionPesosColombianos(){
        this.setPesosColombianos(fn.InputDoubleNumericScanner("escriba los pesos Colombianos  "));
        this.setDolares(getPesosColombianos()*0.00024);
        this.setBolivares(getPesosColombianos()*744.343);
        this.setFrancos(getPesosColombianos()*0.00021);
        this.setSoles(getPesosColombianos()*0.00088);
        this.setPesetas(getPesosColombianos()*3.7461);
        fs.ShowScanner("la comvercion de"+getPesosColombianos()+" pesos a \n Dolares: "+getDolares()+",\n Bolivares: "+ getBolivares()+",\n Francos: "+ getFrancos()+",\n Soles: "+getSoles()+",\n Pesetas: "+getPesetas());
    }
        public void ConversionDolares(){
        this.setDolares(fn.InputDoubleNumericScanner("escriba los Dolares  "));
        this.setPesosColombianos(getDolares()*4140.21);
        this.setBolivares(getDolares()*300.656 );
        this.setFrancos(getDolares()*0.87);
        this.setSoles(getDolares()*3.66);
        this.setPesetas(getDolares()*151.155);
        fs.ShowScanner("la comvercion de"+getDolares()+" Dolares a \n Pesos Colombiano: "+getPesosColombianos()+",\n Bolivares: "+ getBolivares()+",\n Francos: "+ getFrancos()+",\n Soles: "+getSoles()+",\n Pesetas: "+getPesetas());
    }
        public void ConversionBolivares(){
        this.setBolivares(fn.InputDoubleNumericScanner("escriba los Bolivares  "));
        this.setDolares(getBolivares()*0.033257308);
        this.setPesosColombianos(getBolivares()*0.00136318 );
        this.setFrancos(getBolivares()*0.000000294833);
        this.setSoles(getBolivares()*0.000000294833);
        this.setPesetas(getBolivares()*0.0000000512566 );
        fs.ShowScanner("la comvercion de"+getBolivares()+" bolivares a \n Dolares: "+getDolares()+",\n pesos Colombianos: "+ getPesosColombianos()+",\n Francos: "+ getFrancos()+",\n Soles: "+getSoles()+",\n Pesetas: "+getPesetas());
    }
        public void ConversionSoles(){
        this.setSoles(fn.InputDoubleNumericScanner("escriba los pesos Colombianos  "));
        this.setDolares(getSoles()*0.27);
        this.setBolivares(getSoles()*8.21);
        this.setFrancos(getSoles()*0.24);
        this.setPesosColombianos(getSoles()*4.66);
        this.setPesetas(getSoles()*41.1686);
        fs.ShowScanner("la comvercion de"+getSoles()+" Soles a \n Dolares: "+getDolares()+",\n Bolivares: "+ getBolivares()+",\n Francos: "+ getFrancos()+",\n Peso Colombiano: "+getPesosColombianos()+",\n Pesetas: "+getPesetas());
    }

    
    
}
