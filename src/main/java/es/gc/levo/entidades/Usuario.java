package es.gc.levo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIOS")

public class Usuario {
	
//	public static enum role {ADMIN, USER};
//	
//	private role myRole;
//	
//	@Enumerated(value=EnumType.STRING)
//	private role getMyRole() {
//		return myRole;
//	}
//
//	public void setMyRole(role myRole) {
//		this.myRole = myRole;
//	}

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ID", unique = true)	
	private int id;
	
	@Column(name = "USUARIO")
	private String usuario;
	
	@Column(name="CONTRASEÑA")
	private String contraseña;
	
	@Column(name="ROL")
	private String rol;
	
	public String getRol() {
		return rol;
	}
	
	public void setRol(String rol) {
		this.rol=rol;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public Usuario() {}

	public Usuario(String rol, int id, String usuario, String contraseña) {
		super();
		this.rol = rol;
		this.id = id;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}
	
	
	

}
