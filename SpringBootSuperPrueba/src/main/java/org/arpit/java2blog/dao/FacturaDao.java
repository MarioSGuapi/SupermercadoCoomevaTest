package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Factura;



public interface FacturaDao {
	public List<Factura> getAllFacturas() ;

	public Factura getFactura(int idFactura) ;

	public Factura addFactura(Factura factura);

	public void updateFactura(Factura factura) ;

	public void deleteFactura(int idFactura) ;
}
