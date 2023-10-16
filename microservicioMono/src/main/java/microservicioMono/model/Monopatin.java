package microservicioMono.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Monopatin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// mantenimiento,ocupado,disponible,prendido,apagado
	@Column
	private String estado;

	// posicion para el GPS
	@Column
	private float posY;
	@Column
	private float posX;

	// distancia recorrida
	@Column
	private float kmTotal;

	// Constructor vacío
	public Monopatin() {
	}

	// Constructor con todos los campos
	public Monopatin(String estadoInicial, float x, float y) {
		this.estado = estadoInicial;
		this.posX = x;
		this.posY = y;
		this.kmTotal = 0;
	}

}