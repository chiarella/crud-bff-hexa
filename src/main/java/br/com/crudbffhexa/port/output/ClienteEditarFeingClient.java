package br.com.crudbffhexa.port.output;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;

import br.com.crudbffhexa.domain.entity.ClienteIdEntity;

@FeignClient(name = "clienteEditar", url = "http://localhost:8088")
public interface ClienteEditarFeingClient {

	@PutMapping("/v1/cliente/{codigoCliente}")
	ClienteIdEntity editar(ClienteIdEntity clienteIdEntity);

}
