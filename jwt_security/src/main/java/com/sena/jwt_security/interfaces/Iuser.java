package com.sena.jwt_security.interfaces;




import org.springframework.data.repository.CrudRepository;

import com.sena.jwt_security.models.userRegistro;


public interface Iuser extends CrudRepository<userRegistro, String>{



	
	
}