package br.com.crudbffhexa.port.output;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.crudbffhexa.domain.entity.ClienteEntity;

@FeignClient(name = "clienteCriar", url = "http://localhost:8088")
public interface ClienteCriarFeingClient {

	
	@PostMapping("/v1/cliente")
	ClienteEntity criar(ClienteEntity clienteEntity);
	

}
