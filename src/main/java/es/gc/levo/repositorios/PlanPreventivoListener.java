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
	public void preGuardarActualizarPlanPreventivo(PlanPreventivo planPreventivo) throws Exception {
		if (planPreventivo.getLiquidoFrenosKm() < 0 || planPreventivo.getLiquidoFrenosKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getLiquidoFrenosMes() < 0 || planPreventivo.getLiquidoFrenosMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planPreventivo.getOperacionesSistematicasKm() < 0 || planPreventivo.getOperacionesSistematicasKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getOperacionesSistematicasMes() < 0 || planPreventivo.getOperacionesSistematicasMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planPreventivo.getFiltroAireKm() < 0 || planPreventivo.getFiltroAireKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getFiltroAireMes() < 0 || planPreventivo.getFiltroAireMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planPreventivo.getFiltroAireHabitaculoKm() < 0 || planPreventivo.getFiltroAireHabitaculoKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getFiltroAireHabitaculoMes() < 0 || planPreventivo.getFiltroAireHabitaculoMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planPreventivo.getFiltroCombustibleKm() < 0 || planPreventivo.getFiltroCombustibleKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getFiltroCombustibleMes() < 0 || planPreventivo.getFiltroCombustibleMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planPreventivo.getFiltroAntipolenKm() < 0 || planPreventivo.getFiltroAntipolenKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getFiltroAntipolenMes() < 0 || planPreventivo.getFiltroAntipolenMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planPreventivo.getCorreaDistribucionKm() < 0 || planPreventivo.getCorreaDistribucionKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getCorreaDistribucionMes() < 0 || planPreventivo.getCorreaDistribucionMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planPreventivo.getKitDistribucionKm() < 0 || planPreventivo.getKitDistribucionKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getKitDistribucionMes() < 0 || planPreventivo.getKitDistribucionMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planPreventivo.getReglajeProyectoresKm() < 0 || planPreventivo.getReglajeProyectoresKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getReglajeProyectoresMes() < 0 || planPreventivo.getReglajeProyectoresMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planPreventivo.getpHLiquidoRefrigeracionKm() < 0 || planPreventivo.getpHLiquidoRefrigeracionKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getpHLiquidoRefrigeracionMes() < 0 || planPreventivo.getpHLiquidoRefrigeracionMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planPreventivo.getLiquidoRefrigeracionKm() < 0 || planPreventivo.getLiquidoRefrigeracionKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getLiquidoRefrigeracionMes() < 0 || planPreventivo.getLiquidoRefrigeracionMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planPreventivo.getCorreaArrastreAccesoriosKm() < 0 || planPreventivo.getCorreaArrastreAccesoriosKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getCorreaArrastreAccesoriosMes() < 0 || planPreventivo.getCorreaArrastreAccesoriosMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planPreventivo.getKitCorreaArrastreAccesoriosKm() < 0 || planPreventivo.getKitCorreaArrastreAccesoriosKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getKitCorreaArrastreAccesoriosMes() < 0 || planPreventivo.getKitCorreaArrastreAccesoriosMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planPreventivo.getAnticongelanteKm() < 0 || planPreventivo.getAnticongelanteKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getAnticongelanteMes() < 0 || planPreventivo.getAnticongelanteMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planPreventivo.getAceiteTransmisionKm() < 0 || planPreventivo.getAceiteTransmisionKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getAceiteTransmisionMes() < 0 || planPreventivo.getAceiteTransmisionMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
		if (planPreventivo.getBujiasEncendidoKm() < 0 || planPreventivo.getBujiasEncendidoKm() > 1000000) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Km NO pueden ser negativos ni mayores de 1 millon");
		}
		if (planPreventivo.getBujiasEncendidoMes() < 0 || planPreventivo.getBujiasEncendidoMes() > 200) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Meses NO pueden ser negativos ni mayores de 200");
		}
	}

}
