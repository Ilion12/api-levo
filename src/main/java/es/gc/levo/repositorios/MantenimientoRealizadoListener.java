package es.gc.levo.repositorios;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import es.gc.levo.entidades.MantenimientoRealizado;

@Component
public class MantenimientoRealizadoListener {
	
	private MantenimientoRealizadoDAO mantenimientoRealizadoDAO;
	
	@Autowired
	public void init(MantenimientoRealizadoDAO mantenimientoRealizadoDAO) {
		this.mantenimientoRealizadoDAO = mantenimientoRealizadoDAO;
	}
	
	@PrePersist
	@PreUpdate
	public void preGuardarActualizarMantenimientoRealizado(MantenimientoRealizado mantenimientoRealizado) throws Exception {
		if (mantenimientoRealizado.getKilometrosMantenimiento() < 0 || mantenimientoRealizado.getKilometrosMantenimiento() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
	}
	


}
