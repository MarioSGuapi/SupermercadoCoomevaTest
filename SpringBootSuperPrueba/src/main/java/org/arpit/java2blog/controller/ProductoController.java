package org.arpit.java2blog.controller;

import java.util.List;

import org.arpit.java2blog.model.Producto;
import org.arpit.java2blog.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

	@Autowired
	ProductoService productoService;

	@RequestMapping(value = "/getAllProductos", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Producto> getAllProductos(Model model) {

		List<Producto> listOfProductos = productoService.getAllProductos();
		model.addAttribute("producto", new Producto());
		model.addAttribute("listOfProductos", listOfProductos);
		return listOfProductos;
	}

	@RequestMapping(value = "/producto", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllProductos";
	}

	@RequestMapping(value = "/getProducto/{idProducto}", method = RequestMethod.GET, headers = "Accept=application/json")
	public void getProductoById(@PathVariable int idProducto) {
		productoService.getProducto(idProducto);
	}

	@RequestMapping(value = "/addProducto", method = RequestMethod.POST, headers = "Accept=application/json")
	public Producto addProducto(@RequestBody Producto producto) {
		return productoService.addProducto(producto);

	}

	@RequestMapping(value = "/addProducto", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Producto updateProducto(@RequestBody Producto producto) {
		return productoService.updateProducto(producto); 

	}	

	@RequestMapping(value = "/deleteProducto/{idProducto}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteProducto(@PathVariable("idProducto") int idProducto) {
		productoService.deleteProducto(idProducto);


	}	
}
