package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.FacturaDetalle;

public interface FacturaDetalleDao {
	public List<FacturaDetalle> getAllFacturaDetalles() ;

	public FacturaDetalle getFacturaDetalle(int idFacturaDetalle) ;

	public FacturaDetalle addFacturaDetalle(FacturaDetalle facturaDetalle);

	public void updateFacturaDetalle(FacturaDetalle facturaDetalle) ;

	public void deleteFacturaDetalle(int idFacturaDetalle) ;
}
