package Desafio.EdiLabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EdiLabsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdiLabsApplication.class, args);
		
		
	}

}
