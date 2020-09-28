package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Factura;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class FacturaDaoImpl implements FacturaDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public List<Factura> getAllFacturas() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Factura>  facturaList = session.createQuery("from Factura").list();
		return facturaList;
	}

	public Factura getFactura(int idFactura) {
		Session session = this.sessionFactory.getCurrentSession();
		Factura factura = (Factura) session.get(Factura.class, idFactura);
		return factura;
	}

	public Factura addFactura(Factura factura) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(factura);
		return factura;
	}

	public void updateFactura(Factura factura) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(factura);
	}

	public void deleteFactura(int idFactura) {
		Session session = this.sessionFactory.getCurrentSession();
		Factura p = (Factura) session.load(Factura.class, new Integer(idFactura));
		if (null != p) {
			session.delete(p);
		}
	} 
}
