package com.sena.jwt_security.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sena.jwt_security.interfaceService.IUserService;
import com.sena.jwt_security.interfaces.Iuser;
import com.sena.jwt_security.models.userRegistro;


@Service
public class userService implements IUserService {

	
	@Autowired
	private Iuser data;

	@Override
	public String save(userRegistro userRegistro) {
		data.save(userRegistro);
		return userRegistro.getId_user();
	}

	@Override
	public List<userRegistro> findAll() {
		List <userRegistro> listaUser = (List<userRegistro>) data.findAll() ;
		
		return listaUser;
	}

	

	
	@Override
	public Optional<userRegistro> findOne(String id_user) {
		Optional<userRegistro>userRegistro=data.findById(id_user);
		
		return userRegistro;
	}




	
	
	
	
	
}

