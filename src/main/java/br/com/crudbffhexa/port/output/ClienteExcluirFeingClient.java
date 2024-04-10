package br.com.crudbffhexa.port.output;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "clienteExcluir", url = "http://localhost:8088")
public interface ClienteExcluirFeingClient {

	@GetMapping("/v1/cliente/{codigoCliente}")
	String excluir(Long codigoCliente);

}
