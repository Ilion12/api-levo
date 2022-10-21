package es.gc.levo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import es.gc.levo.entidades.Vehiculo;

@RepositoryRestResource(path = "vehiculos", itemResourceRel = "vehiculo", collectionResourceRel = "vehiculos")
public interface VehiculoDAO extends JpaRepository<Vehiculo, Integer> {

	@RestResource(path="por-matricula")
	List<Vehiculo> findByMatriculaIgnoreCase(@Param("matricula")String txt);
	
	@RestResource(path = "por-unidadDestino")
	List<Vehiculo> findByUnidadDestinoIgnoreCase(@Param("unidadDestino") String unidadDestino);

}