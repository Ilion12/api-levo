package es.gc.levo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.gc.levo.entidades.PlanPreventivo;

@RepositoryRestResource(path = "planespreventivos", itemResourceRel = "planpreventivo", collectionResourceRel = "planespreventivos")
public interface PlanPreventivoDAO extends JpaRepository<PlanPreventivo, Integer> {

}
