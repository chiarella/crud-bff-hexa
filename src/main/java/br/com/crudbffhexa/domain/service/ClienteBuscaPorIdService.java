package br.com.crudbffhexa.domain.service;

import org.springframework.stereotype.Service;

import br.com.crudbffhexa.domain.entity.ClienteIdEntity;
import br.com.crudbffhexa.port.input.ClienteBuscaPorIdUseCase;
import br.com.crudbffhexa.port.output.ClienteBuscaPorIdFeingClient;

@Service
public class ClienteBuscaPorIdService implements  ClienteBuscaPorIdUseCase{

	private final ClienteBuscaPorIdFeingClient clienteBuscaPorIdFeingClient;
	
	public ClienteBuscaPorIdService(ClienteBuscaPorIdFeingClient clienteBuscaPorIdFeingClient) {
		this.clienteBuscaPorIdFeingClient = clienteBuscaPorIdFeingClient;
	}

	@Override
	public ClienteIdEntity buscar(Long codigoCliente) {
	return clienteBuscaPorIdFeingClient.buscar(codigoCliente);
	}
	
}
