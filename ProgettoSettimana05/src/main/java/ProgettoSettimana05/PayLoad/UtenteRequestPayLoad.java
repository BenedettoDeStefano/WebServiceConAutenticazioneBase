package ProgettoSettimana05.PayLoad;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UtenteRequestPayLoad {


	private String nome;
	private String cognome;
	private String email;
	private String username;

	// ******************
	private String password;
	// ******************
}
