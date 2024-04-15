package com.sena.jwt_security.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence. Id;



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

	@Column(name="nombre_completo", nullable= false, length = 20)
	private String nombre_completo;

	

	@Column(name="telefono", nullable= false, length = 15)
	private String telefono;

	@Column(name="correo", nullable= false, length = 100)
	private String correo;

	@Column(name="contraseña", nullable= false, length = 100)
	private String contraseña;
	
	@Column(name="confirmar_contraseña", nullable= false, length = 100)
	private String contraseña_contraseña;
	
	@Column(name="rol", nullable= false, length = 100)
	private String rol;


}
