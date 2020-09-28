package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Producto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class ProductoDaoImpl implements ProductoDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public List<Producto> getAllProductos() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Producto>  productoList = session.createQuery("from Producto").list();
		return productoList;
	}

	public Producto getProducto(int idProducto) {
		Session session = this.sessionFactory.getCurrentSession();
		Producto producto = (Producto) session.get(Producto.class, idProducto);
		return producto;
	}

	public Producto addProducto(Producto producto) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(producto);
		return producto;
	}

	public void updateProducto(Producto producto) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(producto);
	}

	public void deleteProducto(int idProducto) {
		Session session = this.sessionFactory.getCurrentSession();
		Producto p = (Producto) session.load(Producto.class, new Integer(idProducto));
		if (null != p) {
			session.delete(p);
		}
	} 
}
