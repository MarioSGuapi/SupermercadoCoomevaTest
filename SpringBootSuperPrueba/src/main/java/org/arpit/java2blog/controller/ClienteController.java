package org.arpit.java2blog.controller;

import java.util.List;

import org.arpit.java2blog.model.Cliente;
import org.arpit.java2blog.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ClienteController {

	@Autowired
	ClienteService clienteService;

	@RequestMapping(value = "/getAllClientes", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Cliente> getAllClientes(Model model) {

		List<Cliente> listOfClientes = clienteService.getAllClientes();
		model.addAttribute("cliente", new Cliente());
		model.addAttribute("listOfClientes", listOfClientes);
		return listOfClientes;
	}

	@RequestMapping(value = "/cliente", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllClientes";
	}

	@RequestMapping(value = "/getCliente/{idCliente}", method = RequestMethod.GET, headers = "Accept=application/json")
	public void getClienteById(@PathVariable int idCliente) {
		clienteService.getCliente(idCliente);
	}

	@RequestMapping(value = "/addCliente", method = RequestMethod.POST, headers = "Accept=application/json")
	public Cliente addCliente(@RequestBody Cliente cliente) {
		return clienteService.addCliente(cliente);

	}

	@RequestMapping(value = "/addCliente", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Cliente updateCliente(@RequestBody Cliente cliente) {
		return clienteService.updateCliente(cliente); 

	}	

	@RequestMapping(value = "/deleteCliente/{idCliente}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCliente(@PathVariable("idCliente") int idCliente) {
		clienteService.deleteCliente(idCliente);


	}	
}
