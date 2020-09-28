package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.FacturaDetalle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FacturaDetalleDaoImpl implements FacturaDetalleDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}


	public List<FacturaDetalle> getAllFacturaDetalles() {
		Session session = this.sessionFactory.getCurrentSession();
		List<FacturaDetalle>  facturaDetalleList = session.createQuery("from FacturaDetalle").list();
		return facturaDetalleList;
	}


	public FacturaDetalle getFacturaDetalle(int idFacturaDetalle) {
		Session session = this.sessionFactory.getCurrentSession();
		FacturaDetalle facturaDetalle = (FacturaDetalle) session.get(FacturaDetalle.class, idFacturaDetalle);
		return facturaDetalle;
	}


	public FacturaDetalle addFacturaDetalle(FacturaDetalle facturaDetalle) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(facturaDetalle);
		return facturaDetalle;
	}


	public void updateFacturaDetalle(FacturaDetalle facturaDetalle) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(facturaDetalle);
	}

	public void deleteFacturaDetalle(int idFacturaDetalle) {
		Session session = this.sessionFactory.getCurrentSession();
		FacturaDetalle facturaDetalle = (FacturaDetalle) session.load(FacturaDetalle.class, new Integer(idFacturaDetalle));
		if (null != facturaDetalle) {
			session.delete(facturaDetalle);
		}
		
	} 
}
