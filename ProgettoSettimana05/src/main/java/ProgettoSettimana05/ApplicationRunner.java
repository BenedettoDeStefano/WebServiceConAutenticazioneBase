package ProgettoSettimana05;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import ProgettoSettimana05.Enum.TipoDispositivo;
import ProgettoSettimana05.Enum.stato;
import ProgettoSettimana05.PayLoad.DispositivoRequestPayLoad;
import ProgettoSettimana05.PayLoad.UtenteRequestPayLoad;
import ProgettoSettimana05.Service.AssegnazioneService;
import ProgettoSettimana05.Service.DispositivoService;
import ProgettoSettimana05.Service.UtenteService;

@Component
public class ApplicationRunner implements CommandLineRunner{

	@Autowired
	UtenteService utenteServ;

	@Autowired
	DispositivoService dispServ;

	@Autowired
	AssegnazioneService assServ;


	@Override
	public void run(String... args) throws Exception {
		
		Faker faker = new Faker(new Locale("it"));

		for (int i = 0; i < 5; i++) {
			String nome = faker.name().firstName();
			String cognome = faker.name().lastName();
			String email = faker.internet().emailAddress();
			String username = (nome + cognome).toLowerCase().trim();
			String password = "1234";
			UtenteRequestPayLoad user = new UtenteRequestPayLoad(nome, cognome, email, username, password);
			utenteServ.create(user);

		}

		DispositivoRequestPayLoad dispositivo1 = new DispositivoRequestPayLoad(TipoDispositivo.PC, stato.ASSEGNATO);
		DispositivoRequestPayLoad dispositivo2 = new DispositivoRequestPayLoad(TipoDispositivo.SMARTPHONE,
				stato.DISMESSO);
		DispositivoRequestPayLoad dispositivo3 = new DispositivoRequestPayLoad(TipoDispositivo.SMARTPHONE,
				stato.IN_MANUTENZIONE);
		DispositivoRequestPayLoad dispositivo4 = new DispositivoRequestPayLoad(TipoDispositivo.TABLET,
				stato.DISPONIBILE);
		dispServ.create(dispositivo1);
		dispServ.create(dispositivo2);
		dispServ.create(dispositivo3);
		dispServ.create(dispositivo4);
		
		
//		assServ.assegnaDispositivo(UUID.fromString("1fc121c3-fa3e-4982-9228-6b16d84284bc"),
//				UUID.fromString("3c935236-0a46-4cba-b0e4-3d4644e45d84"));


	}


}

