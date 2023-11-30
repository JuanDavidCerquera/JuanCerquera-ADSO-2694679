/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.DetalleFactura;

/**
 *
 * @author juan
 */
public class FacturaDetalleC {
        public void GuardarRegistro(int cantidad, Double valor_pagar, Long producto_id, Long Factura_id){
        DetalleFactura detallefactura = new DetalleFactura();
        detallefactura.setCantidad(cantidad);
        detallefactura.setValor_pagar(valor_pagar);
        detallefactura.setProducto_id(producto_id);
        detallefactura.setFactura_id(Factura_id);
        detallefactura.Agregar();
    }
    
        public void ModificarRegistro(Long id, int cantidad, Double valor_pagar, Long producto_id, Long Factura_id){
        DetalleFactura detallefactura = new DetalleFactura();
        detallefactura.setCantidad(cantidad);
        detallefactura.setValor_pagar(valor_pagar);
        detallefactura.setProducto_id(producto_id);
        detallefactura.setFactura_id(Factura_id);
        detallefactura.Agregar();
    }
        public void EliminarRegistroFisico(Long  id){
        DetalleFactura detallefactura = new DetalleFactura();
        detallefactura.setId(id);
        detallefactura.EliminarFisico();
    }
        public void EliminarRegistroLogico(Long  id){
        DetalleFactura detallefactura = new DetalleFactura();
        detallefactura.setId(id);
        detallefactura.EliminarLogico();
    }
}
