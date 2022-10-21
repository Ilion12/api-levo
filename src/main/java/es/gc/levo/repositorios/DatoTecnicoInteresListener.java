package es.gc.levo.repositorios;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import es.gc.levo.entidades.DatoTecnicoInteres;

public class DatoTecnicoInteresListener {
	
	private DatoTecnicoInteresDAO datoTecnicoInteresDAO;
	
	@Autowired
	public void init(DatoTecnicoInteresDAO datoTecnicoInteresDAO) {
		this.datoTecnicoInteresDAO = datoTecnicoInteresDAO;
	}
	
	@PrePersist
	@PreUpdate
	public void preGuardarActualizarDatoTecnicoInteres(DatoTecnicoInteres datoTecnicoInteres) throws Exception {
		if (datoTecnicoInteres.getCapacidadDeposito() < 0 || datoTecnicoInteres.getCapacidadDeposito() > 10000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "DTI NO pueden ser negativos ni mayores de 1000");
		}
		if (datoTecnicoInteres.getCapacidadCarter() < 0 || datoTecnicoInteres.getCapacidadCarter() > 10000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "DTI NO pueden ser negativos ni mayores de 1000");
		}
		if (datoTecnicoInteres.getPresionNeumaticosDelanteros() < 0 || datoTecnicoInteres.getPresionNeumaticosDelanteros() > 10000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "DTI NO pueden ser negativos ni mayores de 1000");
		}
		if (datoTecnicoInteres.getPresionNeumaticosTraseros() < 0 || datoTecnicoInteres.getPresionNeumaticosTraseros() > 10000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "DTI NO pueden ser negativos ni mayores de 1000");
		}
		if (datoTecnicoInteres.getNumeroBaterias() < 0 || datoTecnicoInteres.getNumeroBaterias() > 10) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Numero baterias NO pueden ser negativos ni > 10");
		}
		if (datoTecnicoInteres.getVoltajeBaterias() < 0 || datoTecnicoInteres.getVoltajeBaterias() > 1000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "DTI NO pueden ser negativos ni mayores de 1000");
		}
		if (datoTecnicoInteres.getAmperiosHoraBaterias() < 0 || datoTecnicoInteres.getAmperiosHoraBaterias() > 1000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "DTI NO pueden ser negativos ni mayores de 1000");
		}
		if (datoTecnicoInteres.getAmperajeBaterias() < 0 || datoTecnicoInteres.getAmperajeBaterias() > 1000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "DTI NO pueden ser negativos ni mayores de 1000");
		}
	}

}
