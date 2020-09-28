package org.arpit.java2blog.service;

import java.util.List;

import javax.transaction.Transactional;

import org.arpit.java2blog.dao.FacturaDetalleDao;
import org.arpit.java2blog.model.FacturaDetalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("facturaDetalleService")
public class FacturaDetalleService {

	@Autowired
	FacturaDetalleDao facturaDetalleDao;

	@Transactional
	public List<FacturaDetalle> getAllFacturaDetalles() {
		return facturaDetalleDao.getAllFacturaDetalles();
	}

	@Transactional
	public FacturaDetalle getFacturaDetalle(int idFacturaDetalle) {
		return facturaDetalleDao.getFacturaDetalle(idFacturaDetalle);
	}

	@Transactional
	public FacturaDetalle addFacturaDetalle(FacturaDetalle facturaDetalle) {
		facturaDetalleDao.addFacturaDetalle(facturaDetalle);
		return facturaDetalle;
	}

	@Transactional
	public FacturaDetalle updateFacturaDetalle(FacturaDetalle facturaDetalle) {
		facturaDetalleDao.updateFacturaDetalle(facturaDetalle);
		return facturaDetalle;
	}

	@Transactional
	public void deleteFacturaDetalle(int idFacturaDetalle) {
		facturaDetalleDao.deleteFacturaDetalle(idFacturaDetalle);
	}
}
