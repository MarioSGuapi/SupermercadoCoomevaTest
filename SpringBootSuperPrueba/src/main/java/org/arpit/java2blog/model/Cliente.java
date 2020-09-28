
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
@Table(name="CLIENTE")
public class Cliente{
	
	@Id
	@Column(name="idCliente")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idCliente;
	 
	@Column(name="identificacion")
	int identificacion;
	
	@Column(name="nombres")
	String nombres; 

	@Column(name="apellidos")
	String apellidos;
	
	@Column(name="direccion")
	String direccion;
	
	@Column(name="telefono")
	String telefono;
	
	@Column(name="email")
	String email;

	/**
	 * @param identificacion
	 * @param nombres
	 * @param apellidos
	 * @param direccion
	 * @param telefono
	 * @param email
	 */
	public Cliente(int identificacion, String nombres, String apellidos, String direccion, String telefono,
			String email) {
		super();
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	public Cliente() {
		super();
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
	 * @return the identificacion
	 */
	public int getIdentificacion() {
		return identificacion;
	}

	/**
	 * @param identificacion the identificacion to set
	 */
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
