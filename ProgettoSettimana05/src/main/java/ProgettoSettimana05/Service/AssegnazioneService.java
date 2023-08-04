//package ProgettoSettimana05.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import ProgettoSettimana05.Entities.AssegnazioneDispositivi;
//import ProgettoSettimana05.Entities.Dispositivo;
//import ProgettoSettimana05.Entities.Utente;
//import ProgettoSettimana05.Repository.AssegnazioneDispositiviRepository;
//
//public class AssegnazioneService {
//
//	private final UtenteService utenteService;
//	private final DispositivoService dispositivoService;
//	private final AssegnazioneDispositiviRepository assegnazioneRepository;
//
//	@Autowired
//	public AssegnazioneService(UtenteService utenteService, DispositivoService dispositivoService,
//			AssegnazioneDispositiviRepository assegnazioneRepository) {
//		this.utenteService = utenteService;
//		this.dispositivoService = dispositivoService;
//		this.assegnazioneRepository = assegnazioneRepository;
//	}
//
//	public void assegnaDispositivoAUtente(Utente utente, Dispositivo dispositivo) {
//		AssegnazioneDispositivi assegnazione = new AssegnazioneDispositivi(utente, dispositivo);
//		assegnazioneRepository.save(assegnazione);
//	}
//}
