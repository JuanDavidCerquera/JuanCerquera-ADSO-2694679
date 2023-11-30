/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entity;
import coneccionsql.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan
 */
public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private Long telefono;
    private String correoElectronico;
       public static ArrayList<Persona> listaPersonas= new ArrayList<>();
        public Conexion conn = new Conexion(); 
/*
        public Persona(int id, String nombre,String apellido, Long telefono, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
        */


    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
 

    public ArrayList<Persona> consultar(){
    String sql= "SELECT `Id_Cliente`, `Nombre`, `Apellido`, `Telefono`, `CorreoElectronico` FROM `clientes` WHERE 1";
 
listaPersonas.removeAll(listaPersonas);

 ResultSet resultSet = conn.consultarSQL(sql);
        try {
            while (resultSet.next()) {
                Persona person =new Persona();
                // Obtener datos de la fila actual
                person.setId(resultSet.getInt("Id_Cliente"));
                person.setNombre(resultSet.getString("nombre"));
                person.setApellido(resultSet.getString("apellido"));
                person.setTelefono(resultSet.getLong("telefono"));
                person.setCorreoElectronico(resultSet.getString("CorreoElectronico"));
                // Hacer algo con los datos (por ejemplo, asignarlos a variables)
                listaPersonas.add(person);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
  conn.cerrarConexion(); 
        return listaPersonas;
    }
}
