//package ProgettoSettimana05.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//import ProgettoSettimana05.Entities.AssegnazioneDispositivi;
//import ProgettoSettimana05.PayLoad.AssegnazioneDispositiviPayLoad;
//import ProgettoSettimana05.Service.AssegnazioneService;
//
//@RestController
//@RequestMapping("/AssegnazioneDispositivi")
//public class AssegnazioneDispositiviController {
//
//	private final AssegnazioneService AssServ;
//
//	@Autowired
//	public AssegnazioneDispositiviController(AssegnazioneService assServ) {
//		super();
//		AssServ = assServ;
//	}
//
//	@PostMapping
//	@ResponseStatus(HttpStatus.CREATED)
//	public AssegnazioneDispositivi saveAssegnazione(@RequestBody AssegnazioneDispositiviPayLoad body) {
//		AssegnazioneDispositivi created = AssServ.save(body);
//		return created;
//	}
//
//}
