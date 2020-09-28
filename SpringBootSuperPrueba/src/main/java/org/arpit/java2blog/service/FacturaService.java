package org.arpit.java2blog.service;

import java.util.List;

import javax.transaction.Transactional;

import org.arpit.java2blog.dao.FacturaDao;
import org.arpit.java2blog.model.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("facturaService")
public class FacturaService {

	@Autowired
	FacturaDao facturaDao;

	@Transactional
	public List<Factura> getAllFacturas() {
		return facturaDao.getAllFacturas();
	}

	@Transactional
	public Factura getFactura(int idFactura) {
		return facturaDao.getFactura(idFactura);
	}

	@Transactional
	public Factura addFactura(Factura factura) {
		facturaDao.addFactura(factura);
		return factura;
	}

	@Transactional
	public Factura updateFactura(Factura factura) {
		facturaDao.updateFactura(factura);
		return factura;
	}

	@Transactional
	public void deleteFactura(int idFactura) {
		facturaDao.deleteFactura(idFactura);
	}
}
