package es.gc.levo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import es.gc.levo.repositorios.PlanPreventivoListener;

@Entity
@EntityListeners(PlanPreventivoListener.class)
@Table(name="PLAN_PREVENTIVO")
public class PlanPreventivo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PP_ID", unique = true)	
	private int id;
	
	@Column(name = "CONDICIONES_USO")
	private String condicionesUso;
		
	@Column(name = "COMENTARIOS")
	private String comentarios;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="planMantenimientoPreventivo")
	private Vehiculo vehiculo;
	
	private int liquidoFrenosKm;
	private int liquidoFrenosMes;
	private int operacionesSistematicasKm;
	private int operacionesSistematicasMes;
	private int filtroAireKm;
	private int filtroAireMes;
	private int filtroAireHabitaculoKm;
	private int filtroAireHabitaculoMes;
	private int filtroCombustibleKm;
	private int filtroCombustibleMes;
	private int filtroAntipolenKm;
	private int filtroAntipolenMes;
	private int correaDistribucionKm;
	private int correaDistribucionMes;
	private int kitDistribucionKm;
	private int kitDistribucionMes;
	private int reglajeProyectoresKm;
	private int reglajeProyectoresMes;
	private int pHLiquidoRefrigeracionKm;
	private int pHLiquidoRefrigeracionMes;
	private int liquidoRefrigeracionKm;
	private int liquidoRefrigeracionMes;
	private int correaArrastreAccesoriosKm;
	private int correaArrastreAccesoriosMes;
	private int kitCorreaArrastreAccesoriosKm;
	private int kitCorreaArrastreAccesoriosMes;
	private int anticongelanteKm;
	private int anticongelanteMes;
	private int aceiteTransmisionKm;
	private int aceiteTransmisionMes;
	private int bujiasEncendidoKm;
	private int bujiasEncendidoMes;
	
	public String getCondicionesUso() {
		return condicionesUso;
	}

	public void setCondicionesUso(String condicionesUso) {
		this.condicionesUso = condicionesUso;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public int getLiquidoFrenosKm() {
		return liquidoFrenosKm;
	}

	public void setLiquidoFrenosKm(int liquidoFrenosKm) {
		this.liquidoFrenosKm = liquidoFrenosKm;
	}

	public int getLiquidoFrenosMes() {
		return liquidoFrenosMes;
	}

	public void setLiquidoFrenosMes(int liquidoFrenosMes) {
		this.liquidoFrenosMes = liquidoFrenosMes;
	}

	public int getOperacionesSistematicasKm() {
		return operacionesSistematicasKm;
	}

	public void setOperacionesSistematicasKm(int operacionesSistematicasKm) {
		this.operacionesSistematicasKm = operacionesSistematicasKm;
	}

	public int getOperacionesSistematicasMes() {
		return operacionesSistematicasMes;
	}

	public void setOperacionesSistematicasMes(int operacionesSistematicasMes) {
		this.operacionesSistematicasMes = operacionesSistematicasMes;
	}

	public int getFiltroAireKm() {
		return filtroAireKm;
	}

	public void setFiltroAireKm(int filtroAireKm) {
		this.filtroAireKm = filtroAireKm;
	}

	public int getFiltroAireMes() {
		return filtroAireMes;
	}

	public void setFiltroAireMes(int filtroAireMes) {
		this.filtroAireMes = filtroAireMes;
	}

	public int getFiltroAireHabitaculoKm() {
		return filtroAireHabitaculoKm;
	}

	public void setFiltroAireHabitaculoKm(int filtroAireHabitaculoKm) {
		this.filtroAireHabitaculoKm = filtroAireHabitaculoKm;
	}

	public int getFiltroAireHabitaculoMes() {
		return filtroAireHabitaculoMes;
	}

	public void setFiltroAireHabitaculoMes(int filtroAireHabitaculoMes) {
		this.filtroAireHabitaculoMes = filtroAireHabitaculoMes;
	}

	public int getFiltroCombustibleKm() {
		return filtroCombustibleKm;
	}

	public void setFiltroCombustibleKm(int filtroCombustibleKm) {
		this.filtroCombustibleKm = filtroCombustibleKm;
	}

	public int getFiltroCombustibleMes() {
		return filtroCombustibleMes;
	}

	public void setFiltroCombustibleMes(int filtroCombustibleMes) {
		this.filtroCombustibleMes = filtroCombustibleMes;
	}

	public int getFiltroAntipolenKm() {
		return filtroAntipolenKm;
	}

	public void setFiltroAntipolenKm(int filtroAntipolenKm) {
		this.filtroAntipolenKm = filtroAntipolenKm;
	}

	public int getFiltroAntipolenMes() {
		return filtroAntipolenMes;
	}

	public void setFiltroAntipolenMes(int filtroAntipolenMes) {
		this.filtroAntipolenMes = filtroAntipolenMes;
	}

	public int getCorreaDistribucionKm() {
		return correaDistribucionKm;
	}

	public void setCorreaDistribucionKm(int correaDistribucionKm) {
		this.correaDistribucionKm = correaDistribucionKm;
	}

	public int getCorreaDistribucionMes() {
		return correaDistribucionMes;
	}

	public void setCorreaDistribucionMes(int correaDistribucionMes) {
		this.correaDistribucionMes = correaDistribucionMes;
	}

	public int getKitDistribucionKm() {
		return kitDistribucionKm;
	}

	public void setKitDistribucionKm(int kitDistribucionKm) {
		this.kitDistribucionKm = kitDistribucionKm;
	}

	public int getKitDistribucionMes() {
		return kitDistribucionMes;
	}

	public void setKitDistribucionMes(int kitDistribucionMes) {
		this.kitDistribucionMes = kitDistribucionMes;
	}

	public int getReglajeProyectoresKm() {
		return reglajeProyectoresKm;
	}

	public void setReglajeProyectoresKm(int reglajeProyectoresKm) {
		this.reglajeProyectoresKm = reglajeProyectoresKm;
	}

	public int getReglajeProyectoresMes() {
		return reglajeProyectoresMes;
	}

	public void setReglajeProyectoresMes(int reglajeProyectoresMes) {
		this.reglajeProyectoresMes = reglajeProyectoresMes;
	}

	public int getpHLiquidoRefrigeracionKm() {
		return pHLiquidoRefrigeracionKm;
	}

	public void setpHLiquidoRefrigeracionKm(int pHLiquidoRefrigeracionKm) {
		this.pHLiquidoRefrigeracionKm = pHLiquidoRefrigeracionKm;
	}

	public int getpHLiquidoRefrigeracionMes() {
		return pHLiquidoRefrigeracionMes;
	}

	public void setpHLiquidoRefrigeracionMes(int pHLiquidoRefrigeracionMes) {
		this.pHLiquidoRefrigeracionMes = pHLiquidoRefrigeracionMes;
	}

	public int getLiquidoRefrigeracionKm() {
		return liquidoRefrigeracionKm;
	}

	public void setLiquidoRefrigeracionKm(int liquidoRefrigeracionKm) {
		this.liquidoRefrigeracionKm = liquidoRefrigeracionKm;
	}

	public int getLiquidoRefrigeracionMes() {
		return liquidoRefrigeracionMes;
	}

	public void setLiquidoRefrigeracionMes(int liquidoRefrigeracionMes) {
		this.liquidoRefrigeracionMes = liquidoRefrigeracionMes;
	}

	public int getCorreaArrastreAccesoriosKm() {
		return correaArrastreAccesoriosKm;
	}

	public void setCorreaArrastreAccesoriosKm(int correaArrastreAccesoriosKm) {
		this.correaArrastreAccesoriosKm = correaArrastreAccesoriosKm;
	}

	public int getCorreaArrastreAccesoriosMes() {
		return correaArrastreAccesoriosMes;
	}

	public void setCorreaArrastreAccesoriosMes(int correaArrastreAccesoriosMes) {
		this.correaArrastreAccesoriosMes = correaArrastreAccesoriosMes;
	}

	public int getKitCorreaArrastreAccesoriosKm() {
		return kitCorreaArrastreAccesoriosKm;
	}

	public void setKitCorreaArrastreAccesoriosKm(int kitCorreaArrastreAccesoriosKm) {
		this.kitCorreaArrastreAccesoriosKm = kitCorreaArrastreAccesoriosKm;
	}

	public int getKitCorreaArrastreAccesoriosMes() {
		return kitCorreaArrastreAccesoriosMes;
	}

	public void setKitCorreaArrastreAccesoriosMes(int kitCorreaArrastreAccesoriosMes) {
		this.kitCorreaArrastreAccesoriosMes = kitCorreaArrastreAccesoriosMes;
	}

	public int getAnticongelanteKm() {
		return anticongelanteKm;
	}

	public void setAnticongelanteKm(int anticongelanteKm) {
		this.anticongelanteKm = anticongelanteKm;
	}

	public int getAnticongelanteMes() {
		return anticongelanteMes;
	}

	public void setAnticongelanteMes(int anticongelanteMes) {
		this.anticongelanteMes = anticongelanteMes;
	}

	public int getAceiteTransmisionKm() {
		return aceiteTransmisionKm;
	}

	public void setAceiteTransmisionKm(int aceiteTransimisionKm) {
		this.aceiteTransmisionKm = aceiteTransimisionKm;
	}

	public int getAceiteTransmisionMes() {
		return aceiteTransmisionMes;
	}

	public void setAceiteTransmisionMes(int aceiteTransimisionMes) {
		this.aceiteTransmisionMes = aceiteTransimisionMes;
	}

	public int getBujiasEncendidoKm() {
		return bujiasEncendidoKm;
	}

	public void setBujiasEncendidoKm(int bujiasEncendidoKm) {
		this.bujiasEncendidoKm = bujiasEncendidoKm;
	}

	public int getBujiasEncendidoMes() {
		return bujiasEncendidoMes;
	}

	public void setBujiasEncendidoMes(int bujiasEncendidoMes) {
		this.bujiasEncendidoMes = bujiasEncendidoMes;
	}

	public PlanPreventivo() {}
	
}
