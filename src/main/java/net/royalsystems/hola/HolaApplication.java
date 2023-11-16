package net.royalsystems.hola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HolaApplication extends SpringBootServletInitializer {

	@Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(HolaApplication.class);
  }

	public static void main(String[] args) {
		SpringApplication.run(HolaApplication.class, args);
	}

}
