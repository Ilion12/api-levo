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

import es.gc.levo.repositorios.DatoTecnicoInteresListener;

@Entity
@EntityListeners(DatoTecnicoInteresListener.class)
@Table(name="DATOS_TECNICOS_INTERES")
public class DatoTecnicoInteres {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="DTI_ID", unique = true)	
	private int id;
	
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
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="datosTecnicosInteres")
	private Vehiculo vehiculo;

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

	public DatoTecnicoInteres() {
		super();
	}

	public DatoTecnicoInteres(int id, String bastidor, String color, String combustible, String cambio,
			float capacidadDeposito, String lubricanteMotor, float capacidadCarter, float presionNeumaticosDelanteros,
			float presionNeumaticosTraseros, String tipoCubiertas, int numeroBaterias, float voltajeBaterias,
			float amperiosHoraBaterias, float amperajeBaterias, String clasificacionMedioambiental) {
		super();
		this.id = id;
		this.bastidor = bastidor;
		this.color = color;
		this.combustible = combustible;
		this.cambio = cambio;
		this.capacidadDeposito = capacidadDeposito;
		this.lubricanteMotor = lubricanteMotor;
		this.capacidadCarter = capacidadCarter;
		this.presionNeumaticosDelanteros = presionNeumaticosDelanteros;
		this.presionNeumaticosTraseros = presionNeumaticosTraseros;
		this.tipoCubiertas = tipoCubiertas;
		this.numeroBaterias = numeroBaterias;
		this.voltajeBaterias = voltajeBaterias;
		this.amperiosHoraBaterias = amperiosHoraBaterias;
		this.amperajeBaterias = amperajeBaterias;
		this.clasificacionMedioambiental = clasificacionMedioambiental;
	}
	
	
}
