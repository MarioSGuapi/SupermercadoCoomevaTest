package org.arpit.java2blog.controller;

import java.util.List;

import org.arpit.java2blog.model.Factura;
import org.arpit.java2blog.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FacturaController {

	@Autowired
	FacturaService facturaService;

	@RequestMapping(value = "/getAllFacturas", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Factura> getAllFacturas(Model model) {

		List<Factura> listOfFacturas = facturaService.getAllFacturas();
		model.addAttribute("factura", new Factura());
		model.addAttribute("listOfFacturas", listOfFacturas);
		return listOfFacturas;
	}

	@RequestMapping(value = "/factura", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllFacturas";
	}

	@RequestMapping(value = "/getFactura/{idFactura}", method = RequestMethod.GET, headers = "Accept=application/json")
	public void getFacturaById(@PathVariable int idFactura) {
		facturaService.getFactura(idFactura);
	}

	@RequestMapping(value = "/addFactura", method = RequestMethod.POST, headers = "Accept=application/json")
	public Factura addFactura(@RequestBody Factura factura) {
		return facturaService.addFactura(factura);

	}

	@RequestMapping(value = "/addFactura", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Factura updateFactura(@RequestBody Factura factura) {
		return facturaService.updateFactura(factura); 

	}	

	@RequestMapping(value = "/deleteFactura/{idFactura}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteFactura(@PathVariable("idFactura") int idFactura) {
		facturaService.deleteFactura(idFactura);


	}	
}
