package es.gc.levo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.gc.levo.entidades.MantenimientoRealizado;

@RepositoryRestResource(path = "mantenimientosrealizados", itemResourceRel = "mantenimientorealizado", collectionResourceRel = "mantenimientosrealizados")
public interface MantenimientoRealizadoDAO extends JpaRepository<MantenimientoRealizado, Integer> {

}
