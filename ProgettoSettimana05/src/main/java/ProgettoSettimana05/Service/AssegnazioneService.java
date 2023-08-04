package ProgettoSettimana05.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProgettoSettimana05.Entities.Dispositivo;
import ProgettoSettimana05.Entities.Utente;
import ProgettoSettimana05.Repository.DispositivoRepository;
import ProgettoSettimana05.Repository.UtenteRepository;

@Service
public class AssegnazioneService {

	@Autowired
	private UtenteRepository utenteRepository;

	@Autowired
	private DispositivoRepository dispositivoRepository;

	public void assegnaDispositivo(UUID utenteId, UUID dispositivoId) {
		Utente utente = utenteRepository.findById(utenteId)
				.orElseThrow(() -> new IllegalArgumentException("Utente non trovato con ID: " + utenteId));
		Dispositivo dispositivo = dispositivoRepository.findById(dispositivoId)
				.orElseThrow(() -> new IllegalArgumentException("Dispositivo non trovato con ID: " + dispositivoId));
		dispositivo.setUtente(utente);
		dispositivoRepository.save(dispositivo);
	}

}
