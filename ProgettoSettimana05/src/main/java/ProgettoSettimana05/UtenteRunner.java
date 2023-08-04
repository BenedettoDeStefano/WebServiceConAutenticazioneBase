package ProgettoSettimana05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ProgettoSettimana05.PayLoad.UtenteRequestPayLoad;
import ProgettoSettimana05.Service.UtenteService;

@Component
public class UtenteRunner implements CommandLineRunner{

	@Autowired
	UtenteService utenteServ;


	@Override
	public void run(String... args) throws Exception {
		
		for (int i = 0; i < 5; i++) {
			String nome = "Benedetto";
			String cognome = "DeStefano";
			String email = "ben@live.com";
			String username = (nome + cognome).toLowerCase().trim();
			String password = "1234";
			UtenteRequestPayLoad user = new UtenteRequestPayLoad(nome, cognome, email, username, password);
			// utenteServ.create(user);

		}

	}


}

//		Faker faker = new Faker(new Locale("it"));
//for (int i = 0; i < 30; i++) {
//	String name = faker.name().firstName();
//	String surname = faker.name().lastName();
//	String email = faker.internet().emailAddress();
//	String username = (name + surname).toLowerCase();
//	String password = "1234";
//	UtenteRequestPayLoad user = new UtenteRequestPayLoad(name, surname, email, password, username);
//	// usersServ.create(user);
