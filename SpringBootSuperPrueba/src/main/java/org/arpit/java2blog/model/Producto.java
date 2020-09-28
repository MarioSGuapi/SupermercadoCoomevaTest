
package org.arpit.java2blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Customer table in database
 */
@Entity
@Table(name="PRODUCTO")
public class Producto{

	@Id
	@Column(name="idProducto")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idProducto;
	

	@Column(name="codigo")
	String codigo; 

	@Column(name="nombre")
	String nombre;
	
	@Column(name="valorUnidad")
	int valorUnidad;
	
	@Column(name="stock")
	int stock;

	public Producto() {
		super();
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param valorUnidad
	 * @param stock
	 */
	public Producto(String codigo, String nombre, int valorUnidad, int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.valorUnidad = valorUnidad;
		this.stock = stock;
	}

	/**
	 * @return the idProducto
	 */
	public int getIdProducto() {
		return idProducto;
	}

	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the valorUnidad
	 */
	public int getValorUnidad() {
		return valorUnidad;
	}

	/**
	 * @param valorUnidad the valorUnidad to set
	 */
	public void setValorUnidad(int valorUnidad) {
		this.valorUnidad = valorUnidad;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
