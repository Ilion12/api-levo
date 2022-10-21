package es.gc.levo.repositorios;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import es.gc.levo.entidades.PlanPreventivo;

@Component
public class PlanPreventivoListener {
	
	private PlanPreventivoDAO planPreventivoDAO;
	
	@Autowired
	public void init(PlanPreventivoDAO planPreventivoDAO) {
		this.planPreventivoDAO = planPreventivoDAO;
	}
	
	@PrePersist
	@PreUpdate
	public void preGuardarActualizarPlanPreventivo(PlanPreventivo planesPreventivos) throws Exception {
		if (planesPreventivos.getLiquidoFrenosKm() < 0 || planesPreventivos.getLiquidoFrenosKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getLiquidoFrenosMes() < 0 || planesPreventivos.getLiquidoFrenosMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planesPreventivos.getOperacionesSistematicasKm() < 0 || planesPreventivos.getOperacionesSistematicasKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getOperacionesSistematicasMes() < 0 || planesPreventivos.getOperacionesSistematicasMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planesPreventivos.getFiltroAireKm() < 0 || planesPreventivos.getFiltroAireKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getFiltroAireMes() < 0 || planesPreventivos.getFiltroAireMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planesPreventivos.getFiltroAireHabitaculoKm() < 0 || planesPreventivos.getFiltroAireHabitaculoKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getFiltroAireHabitaculoMes() < 0 || planesPreventivos.getFiltroAireHabitaculoMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planesPreventivos.getFiltroCombustibleKm() < 0 || planesPreventivos.getFiltroCombustibleKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getFiltroCombustibleMes() < 0 || planesPreventivos.getFiltroCombustibleMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planesPreventivos.getFiltroAntipolenKm() < 0 || planesPreventivos.getFiltroAntipolenKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getFiltroAntipolenMes() < 0 || planesPreventivos.getFiltroAntipolenMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planesPreventivos.getCorreaDistribucionKm() < 0 || planesPreventivos.getCorreaDistribucionKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getCorreaDistribucionMes() < 0 || planesPreventivos.getCorreaDistribucionMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planesPreventivos.getKitDistribucionKm() < 0 || planesPreventivos.getKitDistribucionKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getKitDistribucionMes() < 0 || planesPreventivos.getKitDistribucionMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planesPreventivos.getReglajeProyectoresKm() < 0 || planesPreventivos.getReglajeProyectoresKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getReglajeProyectoresMes() < 0 || planesPreventivos.getReglajeProyectoresMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planesPreventivos.getpHLiquidoRefrigeracionKm() < 0 || planesPreventivos.getpHLiquidoRefrigeracionKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getpHLiquidoRefrigeracionMes() < 0 || planesPreventivos.getpHLiquidoRefrigeracionMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planesPreventivos.getLiquidoRefrigeracionKm() < 0 || planesPreventivos.getLiquidoRefrigeracionKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getLiquidoRefrigeracionMes() < 0 || planesPreventivos.getLiquidoRefrigeracionMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planesPreventivos.getCorreaArrastreAccesoriosKm() < 0 || planesPreventivos.getCorreaArrastreAccesoriosKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getCorreaArrastreAccesoriosMes() < 0 || planesPreventivos.getCorreaArrastreAccesoriosMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planesPreventivos.getKitCorreaArrastreAccesoriosKm() < 0 || planesPreventivos.getKitCorreaArrastreAccesoriosKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getKitCorreaArrastreAccesoriosMes() < 0 || planesPreventivos.getKitCorreaArrastreAccesoriosMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planesPreventivos.getAnticongelanteKm() < 0 || planesPreventivos.getAnticongelanteKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getAnticongelanteMes() < 0 || planesPreventivos.getAnticongelanteMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planesPreventivos.getAceiteTransmisionKm() < 0 || planesPreventivos.getAceiteTransmisionKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getAceiteTransmisionMes() < 0 || planesPreventivos.getAceiteTransmisionMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planesPreventivos.getBujiasEncendidoKm() < 0 || planesPreventivos.getBujiasEncendidoKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planesPreventivos.getBujiasEncendidoMes() < 0 || planesPreventivos.getBujiasEncendidoMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
	}

}
