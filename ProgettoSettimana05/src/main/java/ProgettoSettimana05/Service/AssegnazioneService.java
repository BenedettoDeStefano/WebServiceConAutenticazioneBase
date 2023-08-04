//package ProgettoSettimana05.Service;
//
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import ProgettoSettimana05.Entities.AssegnazioneDispositivi;
//import ProgettoSettimana05.Entities.Dispositivo;
//import ProgettoSettimana05.Entities.Utente;
//import ProgettoSettimana05.PayLoad.AssegnazioneDispositiviPayLoad;
//import ProgettoSettimana05.Repository.AssegnazioneDispositiviRepository;
//
//@Service
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
//	public AssegnazioneDispositivi save(AssegnazioneDispositiviPayLoad body) {
//
//		UUID userId = body.getUtenteId();
//		UUID dispositivoId = body.getDispositivoId();
//		Utente user = utenteService.findById(userId);
//		Dispositivo dispositivo = dispositivoService.findById(dispositivoId);
//		AssegnazioneDispositivi newUtenteDispositivo = new AssegnazioneDispositivi(user, dispositivo);
//		return assegnazioneRepository.save(newUtenteDispositivo);
//	}
//
//}
