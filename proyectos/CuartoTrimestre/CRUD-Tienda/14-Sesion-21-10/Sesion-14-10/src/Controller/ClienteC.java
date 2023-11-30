/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.Cliente;


/**
 *
 * @author juan
 */
public class ClienteC {
        public void GuardarRegistro(String nombre, String correo, String telefono, String direccion){
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setCorreo(correo);
        cliente.setTelefono(telefono);
        cliente.setDireccion(direccion);
        cliente.Agregar();
    }
    
    public void ModificarRegistro(Long  id, String nombre, String correo, String telefono, String direccion){
       Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNombre(nombre);
        cliente.setCorreo(correo);
        cliente.setTelefono(telefono);
        cliente.setDireccion(direccion);
        cliente.Modificar();
    }
        public void EliminarRegistroFisico(Long  id){
        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.EliminarFisico();
    }
        public void EliminarRegistroLogico(Long  id){
        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.EliminarLogico();
    }
}
