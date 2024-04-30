package com.sena.jwt_security.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence. Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//get and set
@Data
//consultorr
@Builder
//constructor sin argumento o vacio
@NoArgsConstructor
//constructor sin argumentos
@AllArgsConstructor
@Entity


public class userRegistro {

	
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	@Column(name="id_user", nullable= false, length = 36)
	private String id_user;

	@Column(name="tipo_documento", nullable= false, length = 2)
	private String tipo_documento;

	@Column(name="numero_documento", nullable= false, length = 11)
	private String numero_documento;

	@Column(name="nombre_completo", nullable= false, length = 120)
	private String nombre_completo;

	

	@Column(name="telefono", nullable= false, length = 15)
	private String telefono;

	@Column(name="correo", nullable= false, length = 100)
	private String correo;

	@Column(name="contrasena", nullable= false, length = 100)
	private String contrasena;
	
	@Column(name="confirmar_contrasena", nullable= false, length = 100)
	private String confirmar_contrasena;
	
	@Column(name="rol", nullable= false, length = 100)
	private rol  rol;

	
	public userRegistro() {
		super();
	}

	public userRegistro(String id_user, String tipo_documento, String numero_documento, String nombre_completo,
			String telefono, String correo, String contrasena, String confirmar_contrasena,
			com.sena.jwt_security.models.rol rol) {
		super();
		this.id_user = id_user;
		this.tipo_documento = tipo_documento;
		this.numero_documento = numero_documento;
		this.nombre_completo = nombre_completo;
		this.telefono = telefono;
		this.correo = correo;
		this.contrasena = contrasena;
		this.confirmar_contrasena = confirmar_contrasena;
		this.rol = rol;
	}

	public String getId_user() {
		return id_user;
	}

	public void setId_user(String id_user) {
		this.id_user = id_user;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public String getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getConfirmar_contrasena() {
		return confirmar_contrasena;
	}

	public void setConfirmar_contrasena(String confirmar_contrasena) {
		this.confirmar_contrasena = confirmar_contrasena;
	}

	public rol getRol() {
		return rol;
	}

	public void setRol(rol rol) {
		this.rol = rol;
	}

	
}
