//package ProgettoSettimana05.Security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//import ProgettoSettimana05.Entities.Utente;
//import ProgettoSettimana05.Exception.UnauthorizedException;
//import ProgettoSettimana05.PayLoad.UtenteLoginPayLoad;
//import ProgettoSettimana05.PayLoad.UtenteRequestPayLoad;
//import ProgettoSettimana05.Service.UtenteService;
//
//@Controller
//@RequestMapping("/auth")
//public class AuthController {
//	@Autowired
//	UtenteService utenteService;
//
//	@Autowired
//	JWTTools jwtTools;
//
//	@PostMapping("/register")
//	@ResponseStatus(HttpStatus.CREATED)
//	public Utente saveUser(@RequestBody UtenteRequestPayLoad body) {
//		Utente created = utenteService.create(body);
//
//		return created;
//	}
//
//	@PostMapping("/login")
//	public ResponseEntity<String> login(@RequestBody UtenteLoginPayLoad body) {
//		// 1. Verifichiamo che l'email dell'utente sia presente nel db
//
//		Utente user = utenteService.findByEmail(body.getEmail());
//
//		// 2. In caso affermativo, devo verificare che la pw corrisponda a quella
//		// trovata nel db
//		if (body.getPassword().equals(user.getPassword())) {
//
//			// 3. Se le credenziali sono OK --> genero un JWT e lo invio come risposta
//			String token = jwtTools.createToken(user);
//			return new ResponseEntity<>(token, HttpStatus.OK);
//
//		} else {
//			// 4. Se le credenziali NON sono OK --> 401
//			throw new UnauthorizedException("Credenziali non valide!");
//		}
//	}
//
//}
