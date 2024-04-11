package hu.cubix.fruitnamedisplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ({"hu.cubix.fruitnamedisplay"})
public class FruitsNameDisplayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FruitsNameDisplayApplication.class, args);
	}

}
