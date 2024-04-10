package br.com.crudbffhexa.port.output;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.crudbffhexa.domain.entity.ClienteIdEntity;

@FeignClient(name = "clienteBuscaPorId", url = "http://localhost:8088")
public interface ClienteBuscaPorIdFeingClient {

	@GetMapping("/v1/cliente/{codigoCliente}")
	ClienteIdEntity buscar(@PathVariable Long codigoCliente);
	
}
