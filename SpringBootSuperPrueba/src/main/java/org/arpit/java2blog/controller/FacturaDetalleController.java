package org.arpit.java2blog.controller;

import java.util.List;

import org.arpit.java2blog.model.FacturaDetalle;
import org.arpit.java2blog.service.FacturaDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacturaDetalleController {

	@Autowired
	FacturaDetalleService facturaDetalleService;

	@RequestMapping(value = "/getAllFacturaDetalles", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<FacturaDetalle> getAllFacturaDetalles(Model model) {

		List<FacturaDetalle> listOfFacturaDetalles = facturaDetalleService.getAllFacturaDetalles();
		model.addAttribute("facturaDetalle", new FacturaDetalle());
		model.addAttribute("listOfFacturaDetalles", listOfFacturaDetalles);
		return listOfFacturaDetalles;
	}

	@RequestMapping(value = "/detalle", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllFacturaDetalles";
	}

	@RequestMapping(value = "/getFacturaDetalle/{idFacturaDetalle}", method = RequestMethod.GET, headers = "Accept=application/json")
	public void getFacturaDetalleById(@PathVariable int idFacturaDetalle) {
		facturaDetalleService.getFacturaDetalle(idFacturaDetalle);
	}

	@RequestMapping(value = "/addFacturaDetalle", method = RequestMethod.POST, headers = "Accept=application/json")
	public FacturaDetalle addFacturaDetalle(@RequestBody FacturaDetalle facturaDetalle) {
		return facturaDetalleService.addFacturaDetalle(facturaDetalle);

	}

	@RequestMapping(value = "/addFacturaDetalle", method = RequestMethod.PUT, headers = "Accept=application/json")
	public FacturaDetalle updateFacturaDetalle(@RequestBody FacturaDetalle facturaDetalle) {
		return facturaDetalleService.updateFacturaDetalle(facturaDetalle); 

	}	

	@RequestMapping(value = "/deleteFacturaDetalle/{idFacturaDetalle}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteFacturaDetalle(@PathVariable("idFacturaDetalle") int idFacturaDetalle) {
		facturaDetalleService.deleteFacturaDetalle(idFacturaDetalle);


	}	
}
