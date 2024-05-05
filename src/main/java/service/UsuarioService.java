package service;

import java.util.ArrayList;
import java.util.List;

import entity.Usuario;

public class UsuarioService {

	
	
	
	public List<Usuario> consultarEmpleado(){
		List<Usuario> lstUsuario = new ArrayList<Usuario>();
		
		Usuario praxis = new Usuario();
		Usuario inbursa = new Usuario();
		
		praxis.setNombre("Oscar");
		praxis.setApellidoPaterno("Lara");
		praxis.setApellidoMaterno("Patricio");
		praxis.setEdad(19);
		inbursa.setNombre("Jaque");
		inbursa.setApellidoPaterno("Patricio");
		inbursa.setApellidoMaterno("Lara");
		inbursa.setEdad(10);
		
		
		lstUsuario.add(inbursa);
		lstUsuario.add(praxis);
		
		
		return lstUsuario;
	}
	
}
