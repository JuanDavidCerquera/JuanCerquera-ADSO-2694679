/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.proyecto;

/**
 *
 * @author juan
 */
public class Usuario {
    
    private String nombre;
    private long numeroDocumento;
    private long numeroCelular;
    private String artista;
    private String cancion1;
    private String cancion2;
    private String cancion3;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCancion1() {
        return cancion1;
    }

    public void setCancion1(String cancion1) {
        this.cancion1 = cancion1;
    }

    public String getCancion2() {
        return cancion2;
    }

    public void setCancion2(String cancion2) {
        this.cancion2 = cancion2;
    }

    public String getCancion3() {
        return cancion3;
    }

    public void setCancion3(String cancion3) {
        this.cancion3 = cancion3;
    }

    public Usuario(String nombre, long numeroDocumento, long numeroCelular,  String artista, String cancion1, String cancion2, String cancion3) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.numeroCelular = numeroCelular;

        this.artista = artista;
        this.cancion1 = cancion1;
        this.cancion2 = cancion2;
        this.cancion3 = cancion3;
        
    }


    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public long getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
    
    
    
    
    
    
}
