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
	}

}
