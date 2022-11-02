package es.gc.levo.entidades;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import es.gc.levo.repositorios.MantenimientoRealizadoListener;

@Entity
@EntityListeners(MantenimientoRealizadoListener.class)
@Table(name="MANTENIMIENTOS_REALIZADOS")
public class MantenimientoRealizado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MR_ID", unique = true)	
	private int id;

	@Column(name = "FECHA_MANTENIMIENTO")
	private LocalDate fechaMantenimiento;
	
	@Column(name = "KILOMETROS_MANTENIMIENTO")
	private int kilometrosMantenimiento;
	
	@Column(name = "MESES_MANTENIMIENTO")
	private int mesesMantenimiento;
	
	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "V_ID")
	private Vehiculo vehiculo;
	
	private boolean liquidoFrenos;
	private boolean operacionesSistematicas;
	private boolean filtroAire;
	private boolean filtroAireHabitaculo;
	private boolean filtroCombustible;
	private boolean filtroAntipolen;
	private boolean correaDistribucion;
	private boolean kitDistribucion;
	private boolean reglajeProyectores;
	private boolean pHLiquidoRefrigeracion;
	private boolean liquidoRefrigeracion;
	private boolean correaArrastreAccesorios;
	private boolean kitCorreaArrastreAccesorios;
	private boolean anticongelante;
	private boolean aceiteTransimision;
	private boolean bujiasEncendido;

	public LocalDate getFechaMantenimiento() {
		return fechaMantenimiento;
	}

	public void setFechaMantenimiento(LocalDate fechaMantenimiento) {
		this.fechaMantenimiento = fechaMantenimiento;
	}

	public int getKilometrosMantenimiento() {
		return kilometrosMantenimiento;
	}

	public void setKilometrosMantenimiento(int kilometrosMantenimiento) {
		this.kilometrosMantenimiento = kilometrosMantenimiento;
	}

	public int getMesesMantenimiento() {
		return mesesMantenimiento;
	}

	public void setMesesMantenimiento(int mesesMantenimiento) {
		this.mesesMantenimiento = mesesMantenimiento;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public boolean isLiquidoFrenos() {
		return liquidoFrenos;
	}

	public void setLiquidoFrenos(boolean liquidoFrenos) {
		this.liquidoFrenos = liquidoFrenos;
	}

	public boolean isOperacionesSistematicas() {
		return operacionesSistematicas;
	}

	public void setOperacionesSistematicas(boolean operacionesSistematicas) {
		this.operacionesSistematicas = operacionesSistematicas;
	}

	public boolean isFiltroAire() {
		return filtroAire;
	}

	public void setFiltroAire(boolean filtroAire) {
		this.filtroAire = filtroAire;
	}

	public boolean isFiltroAireHabitaculo() {
		return filtroAireHabitaculo;
	}

	public void setFiltroAireHabitaculo(boolean filtroAireHabitaculo) {
		this.filtroAireHabitaculo = filtroAireHabitaculo;
	}

	public boolean isFiltroCombustible() {
		return filtroCombustible;
	}

	public void setFiltroCombustible(boolean filtroCombustible) {
		this.filtroCombustible = filtroCombustible;
	}

	public boolean isFiltroAntipolen() {
		return filtroAntipolen;
	}

	public void setFiltroAntipolen(boolean filtroAntipolen) {
		this.filtroAntipolen = filtroAntipolen;
	}

	public boolean isCorreaDistribucion() {
		return correaDistribucion;
	}

	public void setCorreaDistribucion(boolean correaDistribucion) {
		this.correaDistribucion = correaDistribucion;
	}

	public boolean isKitDistribucion() {
		return kitDistribucion;
	}

	public void setKitDistribucion(boolean kitDistribucion) {
		this.kitDistribucion = kitDistribucion;
	}

	public boolean isReglajeProyectores() {
		return reglajeProyectores;
	}

	public void setReglajeProyectores(boolean reglajeProyectores) {
		this.reglajeProyectores = reglajeProyectores;
	}

	public boolean ispHLiquidoRefrigeracion() {
		return pHLiquidoRefrigeracion;
	}

	public void setpHLiquidoRefrigeracion(boolean pHLiquidoRefrigeracion) {
		this.pHLiquidoRefrigeracion = pHLiquidoRefrigeracion;
	}

	public boolean isLiquidoRefrigeracion() {
		return liquidoRefrigeracion;
	}

	public void setLiquidoRefrigeracion(boolean liquidoRefrigeracion) {
		this.liquidoRefrigeracion = liquidoRefrigeracion;
	}

	public boolean isCorreaArrastreAccesorios() {
		return correaArrastreAccesorios;
	}

	public void setCorreaArrastreAccesorios(boolean correaArrastreAccesorios) {
		this.correaArrastreAccesorios = correaArrastreAccesorios;
	}

	public boolean isKitCorreaArrastreAccesorios() {
		return kitCorreaArrastreAccesorios;
	}

	public void setKitCorreaArrastreAccesorios(boolean kitCorreaArrastreAccesorios) {
		this.kitCorreaArrastreAccesorios = kitCorreaArrastreAccesorios;
	}

	public boolean isAnticongelante() {
		return anticongelante;
	}

	public void setAnticongelante(boolean anticongelante) {
		this.anticongelante = anticongelante;
	}

	public boolean isAceiteTransimision() {
		return aceiteTransimision;
	}

	public void setAceiteTransimision(boolean aceiteTransimision) {
		this.aceiteTransimision = aceiteTransimision;
	}

	public boolean isBujiasEncendido() {
		return bujiasEncendido;
	}

	public void setBujiasEncendido(boolean bujiasEncendido) {
		this.bujiasEncendido = bujiasEncendido;
	}

	public MantenimientoRealizado() {}
	
	
}
