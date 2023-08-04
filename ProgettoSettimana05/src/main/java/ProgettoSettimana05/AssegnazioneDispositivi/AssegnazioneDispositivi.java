package ProgettoSettimana05.AssegnazioneDispositivi;

import java.util.UUID;

import ProgettoSettimana05.Entities.Dispositivo;
import ProgettoSettimana05.Entities.Utente;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AssegnazioneDispositivi {

	private UUID id;
	private Utente utente;
	private Dispositivo dispositivo;

}
