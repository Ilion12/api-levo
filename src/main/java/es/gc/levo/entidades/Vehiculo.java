package es.gc.levo.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import es.gc.levo.repositorios.VehiculoListener;

@Entity
@EntityListeners(VehiculoListener.class)
@Table(name="VEHICULOS")
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="V_ID", unique = true)	
	private int id;
	
	@Column(name = "MATRICULA")
	private String matricula;
	
	@Column(name = "KILOMETROS_ACTUALES")
	private int kilometrosActuales;
	
	@Column(name = "FECHA_ALTA")
	private LocalDate fechaAlta;
	
	@Column(name = "MESES_ACTUALES")
	private int mesesActuales;
	
	@Column(name = "MARCA")
	private String marca;
	
	@Column(name = "MODELO")
	private String modelo;
	
	@Column(name = "TIPO")
	private String tipo;
	
	@Column(name = "UNIDAD_DESTINO")
	private String unidadDestino;
	
	@Column(name = "FECHA_ADJUDICACION")
	private LocalDate fechaAdjudicacion;
	
	@Column(name = "BASTIDOR")
	private String bastidor;
	
	@Column(name = "COLOR")
	private String color;

	@Column(name = "COMBUSTIBLE")
	private String combustible;
	
	@Column(name = "CAMBIO")
	private String cambio;
	
	@Column(name = "CAPACIDAD_DEPOSITO")
	private float capacidadDeposito;
	
	@Column(name = "LUBRICANTE_MOTOR")
	private String lubricanteMotor;
	
	@Column(name = "CAPACIDAD_CARTER")
	private float capacidadCarter;
	
	@Column(name = "PRESION_NEUMATICOS_DELANTEROS")
	private float presionNeumaticosDelanteros;
	
	@Column(name = "PRESION_NEUMATICOS_TRASEROS")
	private float presionNeumaticosTraseros;
	
	@Column(name = "TIPO_CUBIERTAS")
	private String tipoCubiertas;
	
	@Column(name = "NUMERO_BATERIAS")
	private int numeroBaterias;
	
	@Column(name = "VOLTAJE_BATERIAS")
	private float voltajeBaterias;
	
	@Column(name = "Amph_BATERIAS")
	private float amperiosHoraBaterias;
	
	@Column(name = "Amp_BATERIAS")
	private float amperajeBaterias;
	
	@Column(name = "CLASIFICACION_MEDIOAMBIENTAL")
	private String clasificacionMedioambiental;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PMP_ID")
	private PlanPreventivo planMantenimientoPreventivo;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = MantenimientoRealizado.class, mappedBy = "vehiculo")
	private List<MantenimientoRealizado> mantenimientosRealizados = new ArrayList<>();
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getKilometrosActuales() {
		return kilometrosActuales;
	}
	
	public void setKilometrosActuales(int kilometrosActuales) {
		this.kilometrosActuales = kilometrosActuales;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int getMesesActuales() {
		return mesesActuales;
	}

	public void setMesesActuales(int mesesActuales) {
		this.mesesActuales = mesesActuales;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUnidadDestino() {
		return unidadDestino;
	}

	public void setUnidadDestino(String unidadDestino) {
		this.unidadDestino = unidadDestino;
	}

	public LocalDate getFechaAdjudicacion() {
		return fechaAdjudicacion;
	}

	public void setFechaAdjudicacion(LocalDate fechaAdjudicacion) {
		this.fechaAdjudicacion = fechaAdjudicacion;
	}

	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public float getCapacidadDeposito() {
		return capacidadDeposito;
	}

	public void setCapacidadDeposito(float capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}

	public String getLubricanteMotor() {
		return lubricanteMotor;
	}

	public void setLubricanteMotor(String lubricanteMotor) {
		this.lubricanteMotor = lubricanteMotor;
	}

	public float getCapacidadCarter() {
		return capacidadCarter;
	}

	public void setCapacidadCarter(float capacidadCarter) {
		this.capacidadCarter = capacidadCarter;
	}

	public float getPresionNeumaticosDelanteros() {
		return presionNeumaticosDelanteros;
	}

	public void setPresionNeumaticosDelanteros(float presionNeumaticosDelanteros) {
		this.presionNeumaticosDelanteros = presionNeumaticosDelanteros;
	}

	public float getPresionNeumaticosTraseros() {
		return presionNeumaticosTraseros;
	}

	public void setPresionNeumaticosTraseros(float presionNeumaticosTraseros) {
		this.presionNeumaticosTraseros = presionNeumaticosTraseros;
	}

	public String getTipoCubiertas() {
		return tipoCubiertas;
	}

	public void setTipoCubiertas(String tipoCubiertas) {
		this.tipoCubiertas = tipoCubiertas;
	}

	public int getNumeroBaterias() {
		return numeroBaterias;
	}

	public void setNumeroBaterias(int numeroBaterias) {
		this.numeroBaterias = numeroBaterias;
	}

	public float getVoltajeBaterias() {
		return voltajeBaterias;
	}

	public void setVoltajeBaterias(float voltajeBaterias) {
		this.voltajeBaterias = voltajeBaterias;
	}

	public float getAmperiosHoraBaterias() {
		return amperiosHoraBaterias;
	}

	public void setAmperiosHoraBaterias(float amperiosHoraBaterias) {
		this.amperiosHoraBaterias = amperiosHoraBaterias;
	}

	public float getAmperajeBaterias() {
		return amperajeBaterias;
	}

	public void setAmperajeBaterias(float amperajeBaterias) {
		this.amperajeBaterias = amperajeBaterias;
	}

	public String getClasificacionMedioambiental() {
		return clasificacionMedioambiental;
	}

	public void setClasificacionMedioambiental(String clasificacionMedioambiental) {
		this.clasificacionMedioambiental = clasificacionMedioambiental;
	}

	public PlanPreventivo getPlanMantenimientoPreventivo() {
		return planMantenimientoPreventivo;
	}

	public void setPlanMantenimientoPreventivo(PlanPreventivo planMantenimientoPreventivo) {
		this.planMantenimientoPreventivo = planMantenimientoPreventivo;
	}

	public List<MantenimientoRealizado> getMantenimientosRealizados() {
		return mantenimientosRealizados;
	}

	public void setMantenimientosRealizados(List<MantenimientoRealizado> mantenimientosRealizados) {
		this.mantenimientosRealizados = mantenimientosRealizados;
	}
	
	public void addMantenimientoRealizado(MantenimientoRealizado mantenimientoRealizado) {
		getMantenimientosRealizados().add(mantenimientoRealizado);
		mantenimientoRealizado.setVehiculo(this);
	}

	public Vehiculo() {}
	
}
