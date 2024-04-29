package com.sena.jwt_security.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sena.jwt_security.interfaceService.IUserService;
import com.sena.jwt_security.models.userRegistro;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin
public class userController {

	

@Autowired

private IUserService userService;

@PostMapping("/")
public ResponseEntity<Object> save(@ModelAttribute("userRegistro") userRegistro userRegistro) {
	    
/*	    List<userRegistro> user = userService.filtroIngresoUser(userRegistro.getNumero_documento());
	    if (!user.isEmpty()) {
	        return new ResponseEntity<>("El medico ya tiene un ingreso activo", HttpStatus.BAD_REQUEST);
	    }
	    if (userRegistro.getNumero_documento().equals("")) {

            return new ResponseEntity<>("El numero de identidad es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

        if (userRegistro.getNombre_completo().equals("")) {
            
            return new ResponseEntity<>("El nombre completo es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

       

        if (userRegistro.getTelefono().equals("")) {
            
            return new ResponseEntity<>("El numero de télefono es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }
        

        if (userRegistro.getContraseña().equals("")) {
            
            return new ResponseEntity<>("La contraseña es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }
        
        if (userRegistro.getContraseña_contraseña().equals("")) {
            
            return new ResponseEntity<>("Confirmar contraseña es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }   

        if (userRegistro.getCorreo().equals("")) {
            
            return new ResponseEntity<>("El correo es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }
        
        */
        
		userService.save(userRegistro);
		return new ResponseEntity<>(userRegistro,HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<Object>findAll(){
		var ListaMedico = userService.findAll();
		return new ResponseEntity<>(ListaMedico, HttpStatus.OK);
	}
	
	@GetMapping("/{id_user}")
	public ResponseEntity<Object> findOne ( @PathVariable String id_user ){
		var user= userService.findOne(id_user);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@PutMapping("/{id_user}")
	public ResponseEntity<Object> update(@PathVariable String id_user, @ModelAttribute("userRegistro") userRegistro userUpdate) {
	    
		// Verificar si hay campos vacíos
		
		/*if (useroUpdate.contieneCamposVacios()) {
			return new ResponseEntity<>("Todos los campos son obligatorios", HttpStatus.BAD_REQUEST);
		}*/

		var user = userService.findOne(id_user).get();
		if (user != null) {
			
			


			user.setTipo_documento(userUpdate.getTipo_documento());
			user.setNumero_documento(userUpdate.getNumero_documento());
			user.setNombre_completo(userUpdate.getNombre_completo());
			user.setTelefono(userUpdate.getTelefono());
			user.setCorreo(userUpdate.getCorreo());
			user.setRol(userUpdate.getRol());
			user.setContrasena(userUpdate.getContrasena());
			user.setConfirmar_contrasena(userUpdate.getConfirmar_contrasena());

			userService.save(user);
			return new ResponseEntity<>("Guardado", HttpStatus.OK);

		} else {
			return new ResponseEntity<>("Error medico no encontrado", HttpStatus.BAD_REQUEST);
		}
	}


	
/*@GetMapping("/")
	
	public String home() {
		return "Este es un end point privado del user";
	}
*/
}
