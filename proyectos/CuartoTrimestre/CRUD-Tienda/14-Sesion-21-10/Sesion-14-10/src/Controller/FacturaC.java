/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.Factura;
import java.util.Date;

/**
 *
 * @author juan
 */
public class FacturaC {
        public void GuardarRegistro(String codigo, Date fecha, Double valor_total, long cliente_id){
        Factura factura = new Factura();
        factura.setCodigo(codigo);
        factura.setFecha(fecha);
        factura.setValor_total(valor_total);
        factura.setCliente_id(cliente_id);
        factura.Agregar();
    }
    
    public void ModificarRegistro(Long id, String codigo, Date fecha, Double valor_total, long cliente_id){
        Factura factura = new Factura();
        factura.setId(id);
        factura.setCodigo(codigo);
        factura.setFecha(fecha);
        factura.setValor_total(valor_total);
        factura.setCliente_id(cliente_id);
        factura.Modificar();
    }
        public void EliminarRegistroFisico(Long  id){
        Factura factura = new Factura();
        factura.setId(id);
        factura.EliminarFisico();
    }
        public void EliminarRegistroLogico(Long  id){
        Factura factura = new Factura();
        factura.setId(id);
        factura.EliminarLogico();
    }
}
