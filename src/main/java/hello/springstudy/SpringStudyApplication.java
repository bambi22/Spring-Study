package hello.springstudy;

import hello.springstudy.my.service.MyService;
import hello.springstudy.my.service.MyServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStudyApplication.class, args);
	}

	@Autowired
	private MyServiceFactory myServiceFactory;

	@GetMapping("/execute/{viewType}")
	public ResponseEntity<String> execute(@PathVariable("viewType") String viewType) {
		MyService myService = myServiceFactory.getService(viewType);
		myService.executeService();

		return ResponseEntity.ok(myService.getClass().getSimpleName() + " executed");
	}
}
