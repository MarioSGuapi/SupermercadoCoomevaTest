package org.arpit.java2blog.service;

import java.util.List;

import javax.transaction.Transactional;

import org.arpit.java2blog.dao.ClienteDao;
import org.arpit.java2blog.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service("clienteService")
public class ClienteService {

	@Autowired
	ClienteDao clienteDao;

	@Transactional
	public List<Cliente> getAllClientes() {
		return clienteDao.getAllClientes();
	}

	@Transactional
	public Cliente getCliente(int idCliente) {
		return clienteDao.getCliente(idCliente);
	}

	@Transactional
	public Cliente addCliente(Cliente cliente) {
		clienteDao.addCliente(cliente);
		return cliente;
	}

	@Transactional
	public Cliente updateCliente(Cliente cliente) {
		clienteDao.updateCliente(cliente);
		return cliente;
	}

	@Transactional
	public void deleteCliente(int idCliente) {
		clienteDao.deleteCliente(idCliente);
	}
}
