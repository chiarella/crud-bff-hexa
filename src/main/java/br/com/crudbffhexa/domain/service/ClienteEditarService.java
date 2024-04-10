package br.com.crudbffhexa.domain.service;

import org.springframework.stereotype.Service;

import br.com.crudbffhexa.domain.entity.ClienteIdEntity;
import br.com.crudbffhexa.port.input.ClienteEditarUseCase;
import br.com.crudbffhexa.port.output.ClienteEditarFeingClient;

@Service
public class ClienteEditarService implements ClienteEditarUseCase {
	
	private final ClienteEditarFeingClient clienteEditarFeingClient;
	
	public ClienteEditarService(ClienteEditarFeingClient clienteEditarFeingClient) {
		this.clienteEditarFeingClient = clienteEditarFeingClient;
	}

	@Override
	public ClienteIdEntity editar(Long codigoCliente, String nome, String cpf) {
	return clienteEditarFeingClient.editar(new ClienteIdEntity(codigoCliente, nome, cpf));
	}

}
