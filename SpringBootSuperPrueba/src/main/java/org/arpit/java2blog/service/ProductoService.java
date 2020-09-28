package org.arpit.java2blog.service;

import java.util.List;

import javax.transaction.Transactional;

import org.arpit.java2blog.dao.ProductoDao;
import org.arpit.java2blog.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service("productoService")
public class ProductoService {

	@Autowired
	ProductoDao productoDao;

	@Transactional
	public List<Producto> getAllProductos() {
		return productoDao.getAllProductos();
	}

	@Transactional
	public Producto getProducto(int idProducto) {
		return productoDao.getProducto(idProducto);
	}

	@Transactional
	public Producto addProducto(Producto producto) {
		productoDao.addProducto(producto);
		return producto;
	}

	@Transactional
	public Producto updateProducto(Producto producto) {
		productoDao.updateProducto(producto);
		return producto;
	}

	@Transactional
	public void deleteProducto(int idProducto) {
		productoDao.deleteProducto(idProducto);
	}
}
