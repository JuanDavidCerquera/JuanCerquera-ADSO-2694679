/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entity;

import Conexion.Conexion;
import Model.Interfase.Accion;
/**
 *
 * @author ariel
 */
public class DetalleFactura implements Accion {
    private Long id;
    private int cantidad;
    private Double valor_pagar;
    private Long producto_id;
    private Long factura_id;
    
    public Conexion conn = new Conexion();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getValor_pagar() {
        return valor_pagar;
    }

    public void setValor_pagar(Double valor_pagar) {
        this.valor_pagar = valor_pagar;
    }

    public Long getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Long producto_id) {
        this.producto_id = producto_id;
    }

    public Long getFactura_id() {
        return factura_id;
    }

    public void setFactura_id(Long factura_id) {
        this.factura_id = factura_id;
    }

    @Override
    public void Agregar() {
        String sql; 
        
        sql = "INSERT INTO factura_detalle ("
            +   "cantidad, "
            +   "valor_pagar, "
            +   "producto_id, "
            +   "factura_id, "
            +   "created_at"
            + ") VALUES ("
            +   "' "+this.getCantidad()+"', "
            +   "' "+this.getValor_pagar()+"', "
            +   "' "+this.getProducto_id()+"', "
            +   "' "+this.getFactura_id()+"', "
            +   " NOW()"
            + ");";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();  
    }

    @Override
    public void Modificar() {
       String sql =  "UPDATE factura_detalle SET cantidad = "+"'"+this.getCantidad()+"'"+", valor_pagar = "+"'"+this.getValor_pagar()+"'"+", producto_id = "+"'"+this.getProducto_id()+"'"+", factura_id = "+"'"+this.getFactura_id()+"'"+", updated_at = now()  WHERE id = "+ this.getId()+";";

        conn.ejecutarSQL(sql);
        conn.cerrarConexion();    
    }

    @Override
    public void EliminarFisico() {
        String sql = "DELETE FROM factura_detalle WHERE ID = "+this.getId()+""; 
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();

    }

    @Override
    public void EliminarLogico() {
    
            String sql; 
        
        sql = " UPDATE factura_detalle SET deleted_at = NOW() WHERE id = "+this.getId()+";";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();   
    }

    @Override
    public Object Consultar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String ConsultarWhereAnd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
