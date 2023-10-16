package microservicioMono.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pausas {
	// IDS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int idViaje;

	// tiempo de la pausa
	@Column
	private int tiempoPausa;

	// Constructor con todos los campos
	public Pausas() {

	}

	public Pausas(int idViaje, int tiempo) {
		this.idViaje = idViaje;
		this.tiempoPausa = tiempo;
	}

}
