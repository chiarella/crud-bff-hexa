package br.com.crudbffhexa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CrudBffHexaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudBffHexaApplication.class, args);
	}

}
