package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Producto;

public interface ProductoDao {
	public List<Producto> getAllProductos() ;

	public Producto getProducto(int idProducto) ;

	public Producto addProducto(Producto producto);

	public void updateProducto(Producto producto) ;

	public void deleteProducto(int idProducto) ;
}
