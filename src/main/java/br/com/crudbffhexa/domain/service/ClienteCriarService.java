package br.com.crudbffhexa.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.crudbffhexa.domain.entity.ClienteEntity;
import br.com.crudbffhexa.port.input.ClienteCriarUseCase;
import br.com.crudbffhexa.port.output.ClienteCriarFeingClient;
import jakarta.validation.Valid;

@Service
public class ClienteCriarService implements ClienteCriarUseCase {

	private final ClienteCriarFeingClient clienteCriarFeingClient;

	public ClienteCriarService(ClienteCriarFeingClient clienteCriarFeingClient) {
		this.clienteCriarFeingClient = clienteCriarFeingClient;
	}

	@Override
	public ClienteEntity criarCliente(@Valid @RequestBody ClienteEntity clienteEntity) {
	return clienteCriarFeingClient.criar(clienteEntity);
	}
	
}
