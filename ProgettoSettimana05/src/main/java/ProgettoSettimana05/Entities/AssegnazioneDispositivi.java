//package ProgettoSettimana05.Entities;
//
//import java.util.UUID;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//public class AssegnazioneDispositivi {
//
//	@Id
//	@GeneratedValue
//	private UUID id;
//	@ManyToOne
//	private Utente utente;
//	@ManyToOne
//	private Dispositivo dispositivo;
//
//	public AssegnazioneDispositivi(Utente utente, Dispositivo dispositivo) {
//		this.utente = utente;
//		this.dispositivo = dispositivo;
//	}
//
//}
