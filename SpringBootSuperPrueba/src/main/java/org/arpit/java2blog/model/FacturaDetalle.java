/**
 * 
 */
package org.arpit.java2blog.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author msg98
 *
 */

@Entity
@Table(name="FACTURA_DETALLE")
public class FacturaDetalle {

	@Id
	@Column(name="idFacturaDetalle")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idFacturaDetalle;
	
	@Column(name="idFactura")
	int idFactura;
	
	@Column(name="idProducto")
	int idProducto;
	
	@Column(name="cantidad")
	int cantidad;

	@Column(name="valorUnidad")
	Double valorUnidad;
	
	@Column(name="valorTotal")
	Double valorTotal;

	/**
	 * 
	 */

	public FacturaDetalle() {
		super();
	}

	/**
	 * @param idFactura
	 * @param idProducto
	 * @param cantidad
	 * @param valorUnidad
	 * @param valorTotal
	 */
	public FacturaDetalle(int idFactura, int idProducto, int cantidad, Double valorUnidad, Double valorTotal) {
		super();
		this.idFactura = idFactura;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.valorUnidad = valorUnidad;
		this.valorTotal = valorTotal;
	}

}
