package es.gc.levo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import es.gc.levo.entidades.Usuario;

@RepositoryRestResource(path = "usuarios", itemResourceRel = "usuario", collectionResourceRel = "usuarios")
public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {
	
	
	@RestResource(path="por-rol")
	List<Usuario> findByRol(@Param("rol") String rol);
	
	@RestResource(path="buscar-usuario")
	Usuario findByUsuarioAndContraseña(@Param("usuario") String usuario, @Param("contraseña") String contraseña);

}
