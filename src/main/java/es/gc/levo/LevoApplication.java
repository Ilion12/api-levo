package es.gc.levo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:config/jpa-config.xml"})
public class LevoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LevoApplication.class, args);
	}

}
