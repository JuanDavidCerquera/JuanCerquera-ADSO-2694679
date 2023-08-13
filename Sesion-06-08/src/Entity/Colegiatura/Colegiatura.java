/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity.Colegiatura;

import Utils.FunctionString;
import java.util.Scanner;

/**
 *
 * @author Ambiente 209-2
 */
public class Colegiatura {
    FunctionString fs = new FunctionString(); 
    String colegiatura;
    double promedio;
    int materiaReprobadas;
    int unidades;
    double descuento;
    double precioTotal;

    public String getColegiatura() {
        return colegiatura;
    }

    public void setColegiatura(String colegiatura) {
        this.colegiatura = colegiatura;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getMateriaReprobadas() {
        return materiaReprobadas;
    }

    public void setMateriaReprobadas(int materiaReprobadas) {
        this.materiaReprobadas = materiaReprobadas;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }




    
    public void Condicionales(){
        if("preparatoria".equals(getColegiatura())){
            
        if(getPromedio() >= 9.5){
           setUnidades(55);
           setDescuento(0.25);
           
        
        }else if(getPromedio() >= 9 & getPromedio() < 9.5){
                       setUnidades(55);
            setDescuento(0.10);
            
        
        }else if(getPromedio() >= 7 & getPromedio() < 9){
            setUnidades(50);
        
        }else if(getPromedio() < 7){
            
        if(getMateriaReprobadas() >=0 & getMateriaReprobadas() <= 3){
            setUnidades(45);
        
        }else if(getMateriaReprobadas() >=4){
            setUnidades(40);
            
        }
        }

            if(getDescuento()==0){
                setDescuento(1);
            }
          
        setPrecioTotal(((getUnidades()/5)*180)*getDescuento());
        fs.ShowScanner(String.valueOf(getPrecioTotal()));
        }
        if("profesional".equals(getColegiatura())){
        if(getPromedio() >= 9.5){
          setUnidades(55);
           setDescuento(0.20);
            
        }else if(getPromedio() < 9.5){
            setUnidades(55);
        }
                    if(getDescuento()==0){
                setDescuento(1);
            }
        setPrecioTotal(((getUnidades()/5)*300)*getDescuento());
        fs.ShowScanner(String.valueOf(getPrecioTotal()));
        }
    }
    
    
}
