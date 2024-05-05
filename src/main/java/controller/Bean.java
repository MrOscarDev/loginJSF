package controller;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@SessionScoped
public class Bean {

	private String name;
	private String pass;

	public String doLogin() throws IOException {
		if(this.name !=null &&  this.pass !=null) {
			System.out.println("Tienes Valores");
			if(this.name.equals("oscar") && this.pass.equals("12345")) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtName", new FacesMessage(FacesMessage.SEVERITY_INFO, "Accesos Correctos", ""));
				redireccionar("inicio.xhtml");
			}else {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtName", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Accesos inCorrectos", ""));
				
			}
		}
		return "Login";
	}
	
	public void redireccionar(String pagina) throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect(pagina);	
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


}


