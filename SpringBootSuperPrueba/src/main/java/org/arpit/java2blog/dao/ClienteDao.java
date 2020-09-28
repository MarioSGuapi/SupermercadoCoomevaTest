package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Cliente;

public interface ClienteDao {
	public List<Cliente> getAllClientes() ;

	public Cliente getCliente(int idCliente) ;

	public Cliente addCliente(Cliente cliente);

	public void updateCliente(Cliente cliente) ;

	public void deleteCliente(int idCliente) ;
}
