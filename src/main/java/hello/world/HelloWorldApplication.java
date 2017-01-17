package hello.world;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class HelloWorldApplication {


	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/food")
	@ResponseBody
	String food() {
		return "I love pancakes.";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}