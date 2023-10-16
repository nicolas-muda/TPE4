package microservicioMono.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Viaje {
	// IDS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int idCuenta;
	@Column
	private int idMonopatin;

	// fechas
	@Column
	private Date fechaInicio;
	@Column
	private Date fechaFin;

	// horas
	@Column
	private long horaInicio;
	@Column
	private long horaFin;

	// km recorridos en el viaje
	@Column
	private float kmRecorridos;

	// estado del viaje en pausa, en movimiento, etc
	@Column
	private String estado;

	// cantidad de tiempo en pausa
	@Column
	private int tiempoPausa;

	// Constructor vacío
	public Viaje() {
	}

	// Constructor con todos los campos
	public Viaje(int idCuenta, int idmonopatin, Date fecha) {
		this.idCuenta = idCuenta;
		this.idMonopatin = idmonopatin;
		this.fechaInicio = fecha;
		this.horaInicio = fecha.getTime();
		this.estado = "en camino";
		this.kmRecorridos = 0;
		this.tiempoPausa = 0;
	}

}
