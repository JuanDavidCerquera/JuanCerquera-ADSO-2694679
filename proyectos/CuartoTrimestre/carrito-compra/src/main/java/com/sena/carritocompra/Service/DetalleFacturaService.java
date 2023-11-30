package com.sena.carritocompra.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.carritocompra.Entity.DetalleFactura;
import com.sena.carritocompra.IRepository.IDetalleFacturaRepository;
import com.sena.carritocompra.IService.IDetalleFacturaService;



@Service
public class DetalleFacturaService implements IDetalleFacturaService{

	@Autowired
	private IDetalleFacturaRepository repository;
	
	@Override
	public List<DetalleFactura> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<DetalleFactura> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public DetalleFactura save(DetalleFactura detalle_factura) {
		detalle_factura.setFechaCreacion(LocalDateTime.now());
		return repository.save(detalle_factura);
	}

	@Override
	public void update(DetalleFactura detalle_factura, Long id) {
		//Consultar si existe el registro
				Optional<DetalleFactura> op = repository.findById(id);
				
				if(op.isEmpty()){
					System.out.print("Registro no existe.");
				}else {
					DetalleFactura updateDetalleFactura = op.get();					
					updateDetalleFactura.setCantidad(detalle_factura.getCantidad());
					updateDetalleFactura.setValorPagar(detalle_factura.getValorPagar());
					updateDetalleFactura.setProductoId(detalle_factura.getProductoId());
					updateDetalleFactura.setFacturaId(detalle_factura.getFacturaId());
					updateDetalleFactura.setFechaModificacion(LocalDateTime.now());
					
					repository.save(updateDetalleFactura);
				}	
		
	}
	
	@Override
	public void deletedAt(Long id) {
		//Consultar si existe el registro
		Optional<DetalleFactura> op = repository.findById(id);
		
		if(op.isEmpty()){
			System.out.print("Registro no existe para eliminar.");
		}else {
			DetalleFactura updateDetalleFactura = op.get();					
			updateDetalleFactura.setFechaEliminacion(LocalDateTime.now());					
			repository.save(updateDetalleFactura);
		}	
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);	
	}

}