package ProgettoSettimana05.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ProgettoSettimana05.Entities.Dispositivo;
import ProgettoSettimana05.PayLoad.DispositivoRequestPayLoad;
import ProgettoSettimana05.Service.DispositivoService;

@RestController
@RequestMapping("/dispositivi")
public class DispositivoController {

	private final DispositivoService dispServ;

	@Autowired
	public DispositivoController(DispositivoService dispServ) {
		super();
		this.dispServ = dispServ;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Dispositivo saveUser(@RequestBody DispositivoRequestPayLoad body) {
		Dispositivo created = dispServ.create(body);

		return created;
	}

}
