package trilha.back.financys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages = {"trilha.back.financys"})
@ComponentScan(basePackages = {"trilha.back.financys.Controllers"})
@SpringBootApplication
public class FinancysApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancysApplication.class, args);
	}

}
