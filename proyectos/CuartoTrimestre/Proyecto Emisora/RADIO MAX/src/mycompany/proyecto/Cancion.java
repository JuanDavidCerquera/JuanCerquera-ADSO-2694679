/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.proyecto;

/**
 *
 * @author juan
 */
public class Cancion  implements Comparable<Cancion>  {
    private String titulo;
    private Artista artista;
    private int contador;

    public Cancion(String titulo, Artista artista, int contador) {
        this.titulo = titulo;
        this.artista = artista;
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public int compareTo(Cancion otraCancion) {
    return Integer.compare(otraCancion.getContador(), this.contador);
    }
}

