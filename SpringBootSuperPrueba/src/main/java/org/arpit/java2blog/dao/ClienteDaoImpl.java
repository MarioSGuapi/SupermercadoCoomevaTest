package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class ClienteDaoImpl implements ClienteDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public List<Cliente> getAllClientes() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Cliente>  clienteList = session.createQuery("from Cliente").list();
		return clienteList;
	}

	public Cliente getCliente(int idCliente) {
		Session session = this.sessionFactory.getCurrentSession();
		Cliente cliente = (Cliente) session.get(Cliente.class, idCliente);
		return cliente;
	}

	public Cliente addCliente(Cliente cliente) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(cliente);
		return cliente;
	}

	public void updateCliente(Cliente cliente) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(cliente);
	}

	public void deleteCliente(int idCliente) {
		Session session = this.sessionFactory.getCurrentSession();
		Cliente p = (Cliente) session.load(Cliente.class, new Integer(idCliente));
		if (null != p) {
			session.delete(p);
		}
	} 
}
