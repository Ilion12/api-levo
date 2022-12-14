package es.gc.levo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.gc.levo.entidades.DatoTecnicoInteres;

@RepositoryRestResource(path = "datostecnicosinteres", itemResourceRel = "datotecnicointeres", collectionResourceRel = "datostecnicosinteres")
public interface DatoTecnicoInteresDAO extends JpaRepository<DatoTecnicoInteres, Integer> {

}
