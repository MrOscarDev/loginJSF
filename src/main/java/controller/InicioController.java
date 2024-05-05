package controller;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entity.Usuario;
import service.UsuarioService;

@SuppressWarnings("deprecation")
@ManagedBean
@ViewScoped
public class InicioController {

	private List<Usuario> lstUser;
	
	private UsuarioService user = new UsuarioService();
	
	public void consultarUsers() {
		this.lstUser = this.user.consultarEmpleado();
	}

	public List<Usuario> getLstUser() {
		return lstUser;
	}

	public void setLstUser(List<Usuario> lstUser) {
		this.lstUser = lstUser;
	}
	

    @PostConstruct
    public void init() {
    	consultarUsers();
    }
	
}
