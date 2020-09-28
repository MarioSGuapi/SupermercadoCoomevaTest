
package org.arpit.java2blog.model;

import java.util.Date;

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
@Table(name="FACTURA")
public class Factura{
	
	@Id
	@Column(name="idFactura")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idFactura;
	 
	@Column(name="idCliente")
	int idCliente;
	
	@Column(name="fechaVenta")
	Date fechaVenta;

	@Column(name="valorTotal")
	Double valorTotal;

	/**
	 * @param idFactura
	 * @param idCliente
	 * @param fechaVenta
	 * @param valorTotal
	 */
	public Factura( int idCliente, Date fechaVenta, Double valorTotal) {
		super();
		this.idCliente = idCliente;
		this.fechaVenta = fechaVenta;
		this.valorTotal = valorTotal;
	}

	/**
	 * @return the idFactura
	 */
	public int getIdFactura() {
		return idFactura;
	}

	/**
	 * @param idFactura the idFactura to set
	 */
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	/**
	 * @return the idCliente
	 */
	public int getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * @return the fechaVenta
	 */
	public Date getFechaVenta() {
		return fechaVenta;
	}

	/**
	 * @param fechaVenta the fechaVenta to set
	 */
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	/**
	 * @return the valorTotal
	 */
	public Double getValorTotal() {
		return valorTotal;
	}

	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	/**
	 * 
	 */
	public Factura() {
		super();
	}
}
