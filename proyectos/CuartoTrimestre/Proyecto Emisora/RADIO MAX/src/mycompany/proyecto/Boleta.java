/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.proyecto;


public class Boleta {
    
    public String color;
    public int numero;
    public Usuario usuarioboleta; 

    public Boleta(String color, int numero, Usuario usuarioboleta) {
        this.color = color;
        this.numero = numero;
        this.usuarioboleta = usuarioboleta;
    }

    public Usuario getUsuarioboleta() {
        return usuarioboleta;
    }

    public void setUsuarioboleta(Usuario usuarioboleta) {
        this.usuarioboleta = usuarioboleta;
    }
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
