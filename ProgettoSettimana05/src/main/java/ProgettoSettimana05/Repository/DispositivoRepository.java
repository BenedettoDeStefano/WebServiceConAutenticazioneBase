package ProgettoSettimana05.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProgettoSettimana05.Entities.Dispositivo;

@Repository
public interface DispositivoRepository extends JpaRepository<Dispositivo, UUID> {

}