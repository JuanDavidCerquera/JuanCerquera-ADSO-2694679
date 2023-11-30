package com.sena.carritocompra.IService;

import java.util.List;
import java.util.Optional;

import com.sena.carritocompra.Entity.DetalleFactura;

public interface IDetalleFacturaService {

	/**
	 * Método para consultar todo
	 * **/

	
	/**
	 * Método para consultar por id
	 * **/
	public Optional<DetalleFactura> findById(Long id);
	
	
	/**
	 * Método para guardar
	 * **/
	public DetalleFactura save(DetalleFactura detalle_factura);
	
	/**
	 * Método para modificar
	 * **/
	public void update(DetalleFactura detalle_factura, Long id);
	
	/**
	 * Método para eliminar
	 * **/
	public void delete(Long id);
	
	/**
	 * Método para eliminar lógico
	 * **/
	public void deletedAt(Long id);

	public List<DetalleFactura> findAll();
}