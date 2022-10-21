package es.gc.levo.repositorios;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import es.gc.levo.entidades.Vehiculo;

@Component
public class VehiculoListener {
	
	private VehiculoDAO vehiculoDAO;
	
	@Autowired
	public void init(VehiculoDAO vehiculoDAO) {
		this.vehiculoDAO = vehiculoDAO;
	}
	
	@PrePersist
	@PreUpdate
	public void preGuardarActualizarVehiculo(Vehiculo vehiculo) throws Exception {
		if (vehiculo.getKilometrosActuales() < 0 || vehiculo.getKilometrosActuales() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (vehiculo.getCapacidadDeposito() < 0 || vehiculo.getCapacidadDeposito() > 1000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Capacidad deposito NO puede ser negativa ni mayor de 1000");
		}
		if (vehiculo.getCapacidadCarter() < 0 || vehiculo.getCapacidadCarter() > 1000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Capacidad carter NO puede ser negativa ni mayor de 1000");
		}
		if (vehiculo.getPresionNeumaticosDelanteros() < 0 || vehiculo.getPresionNeumaticosDelanteros() > 1000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Presion neumaticos NO puede ser negativa ni mayor de 1000");
		}
		if (vehiculo.getPresionNeumaticosTraseros() < 0 || vehiculo.getPresionNeumaticosTraseros() > 1000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Presion neumaticos NO puede ser negativa ni mayor de 1000");
		}
		if (vehiculo.getNumeroBaterias() < 0 || vehiculo.getNumeroBaterias() > 10) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Numero de baterias NO puede ser negativo ni mayor de 10");
		}
		if (vehiculo.getVoltajeBaterias() < 0 || vehiculo.getVoltajeBaterias() > 1000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Voltaje de baterias NO puede ser negativo ni mayor de 1000");
		}
		if (vehiculo.getAmperiosHoraBaterias() < 0 || vehiculo.getAmperiosHoraBaterias() > 1000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Amperios Hora de baterias NO puede ser negativo ni mayor de 1000");
		}
		if (vehiculo.getAmperajeBaterias() < 0 || vehiculo.getAmperajeBaterias() > 1000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Amperaje de baterias NO puede ser negativo ni mayor de 1000");
		}
		
	}

}
