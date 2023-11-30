/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entity;

import Conexion.Conexion;
import Model.Interfase.Accion;
import java.util.Date;

/**
 *
 * @author ariel
 */
public class Factura implements Accion{
    private long id;
    private String codigo;
    private Date fecha;
    private Double valor_total;
    private long cliente_id;
    public Conexion conn = new Conexion(); 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getValor_total() {
        return valor_total;
    }

    public void setValor_total(Double valor_total) {
        this.valor_total = valor_total;
    }

    public long getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(long cliente_id) {
        this.cliente_id = cliente_id;
    }

    @Override
    public void Agregar() {

        String sql; 
        
        sql = "INSERT INTO factura ("
            +   "codigo, "
            +   "fecha, "
            +   "valor_total, "
            +   "cliente_id, "
            +   "created_at"
            + ") VALUES ("
            +   "' "+this.getCodigo()+"', "
            +   "' "+this.getFecha()+"', "
            +   "' "+this.getValor_total()+"', "
            +   "' "+this.getCliente_id()+"', "
            +   " NOW()"
            + ");";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();   

    }

    @Override
    public void Modificar() {
       String sql =  "UPDATE factura SET codigo = "+"'"+this.getCodigo()+"'"+", fecha = "+"'"+this.getFecha()+"'"+", valor_total = "+"'"+this.getValor_total()+"'"+", cliente_id = "+"'"+this.getCliente_id()+"'"+", updated_at = now()  WHERE id = "+ this.getId()+";";

        conn.ejecutarSQL(sql);
        conn.cerrarConexion();    
    }

    @Override
    public void EliminarFisico() {
        String sql = "DELETE FROM factura WHERE ID = "+this.getId()+""; 
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();

    }

    @Override
    public void EliminarLogico() {
    
            String sql; 
        
        sql = " UPDATE factura SET deleted_at = NOW() WHERE id = "+this.getId()+";";
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
