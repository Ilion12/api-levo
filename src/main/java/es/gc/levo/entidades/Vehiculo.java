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
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DTI_ID")
	private DatoTecnicoInteres datosTecnicosInteres;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PP_ID")
	private PlanPreventivo planespreventivos;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = MantenimientoRealizado.class, mappedBy = "vehiculo")
	private List<MantenimientoRealizado> mantenimientosrealizados = new ArrayList<>();
	
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

	public DatoTecnicoInteres getDatosTecnicosInteres() {
		return datosTecnicosInteres;
	}

	public void setDatosTecnicosInteres(DatoTecnicoInteres datosTecnicosInteres) {
		this.datosTecnicosInteres = datosTecnicosInteres;
	}	



	public PlanPreventivo getPlanespreventivos() {
		return planespreventivos;
	}

	public void setPlanespreventivos(PlanPreventivo planespreventivos) {
		this.planespreventivos = planespreventivos;
	}

	public List<MantenimientoRealizado> getMantenimientosRealizados() {
		return mantenimientosrealizados;
	}

	public void setMantenimientosRealizados(List<MantenimientoRealizado> mantenimientosrealizados) {
		this.mantenimientosrealizados = mantenimientosrealizados;
	}
	
	public void addMantenimientoRealizado(MantenimientoRealizado mantenimientorealizado) {
		getMantenimientosRealizados().add(mantenimientorealizado);
		mantenimientorealizado.setVehiculo(this);
	}

	public Vehiculo() {}
	
}
