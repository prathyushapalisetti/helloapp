package SpringHelloWorld.demohelloApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloAppController {
	@RequestMapping("/HelloWorld")
		public String HelloWorld() {
			return "Hello World";
		}	
	}

