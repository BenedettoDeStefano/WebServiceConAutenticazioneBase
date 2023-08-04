package ProgettoSettimana05.Repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProgettoSettimana05.Entities.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, UUID> {
	Optional<Utente> findByEmail(String email);
}
