package ProgettoSettimana05.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ProgettoSettimana05.Entities.Utente;
import ProgettoSettimana05.Exception.UnauthorizedException;
import ProgettoSettimana05.PayLoad.UtenteLoginPayLoad;
import ProgettoSettimana05.PayLoad.UtenteRequestPayLoad;
import ProgettoSettimana05.Service.UtenteService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	UtenteService utenteService;

	@Autowired
	JWTTools jwtTools;

	@PostMapping("/register")
	@ResponseStatus(HttpStatus.CREATED)
	public Utente saveUser(@RequestBody UtenteRequestPayLoad body) {
		Utente created = utenteService.create(body);

		return created;
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody UtenteLoginPayLoad body) {

		Utente user = utenteService.findByEmail(body.getEmail());


		if (body.getPassword().equals(user.getPassword())) {


			String token = jwtTools.createToken(user);
			return new ResponseEntity<>(token, HttpStatus.OK);

		} else {

			throw new UnauthorizedException("Credenziali non valide!");
		}
	}

}
