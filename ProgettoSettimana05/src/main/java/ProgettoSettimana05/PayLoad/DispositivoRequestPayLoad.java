package ProgettoSettimana05.PayLoad;

import ProgettoSettimana05.Enum.TipoDispositivo;
import ProgettoSettimana05.Enum.stato;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DispositivoRequestPayLoad {

	@Enumerated(EnumType.STRING)
	private TipoDispositivo tipo;

	@Enumerated(EnumType.STRING)
	private stato stato;

}
