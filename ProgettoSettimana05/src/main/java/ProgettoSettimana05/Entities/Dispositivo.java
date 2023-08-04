package ProgettoSettimana05.Entities;

import java.util.UUID;

import ProgettoSettimana05.Enum.TipoDispositivo;
import ProgettoSettimana05.Enum.stato;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Dispositivo {

	@Id
	@GeneratedValue
	private UUID id;

	@Enumerated(EnumType.STRING)
	private TipoDispositivo tipo;

	@Enumerated(EnumType.STRING)
	private stato stato;

	public Dispositivo(TipoDispositivo tipo, ProgettoSettimana05.Enum.stato stato) {
		this.tipo = tipo;
		this.stato = stato;
	}

}
