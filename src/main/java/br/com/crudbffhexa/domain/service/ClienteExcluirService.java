package br.com.crudbffhexa.domain.service;

import org.springframework.stereotype.Service;

import br.com.crudbffhexa.port.input.ClienteExcluirUseCase;
import br.com.crudbffhexa.port.output.ClienteExcluirFeingClient;

@Service
public class ClienteExcluirService implements ClienteExcluirUseCase {

	private final ClienteExcluirFeingClient clienteExcluirFeingClient;
	
	public ClienteExcluirService(
			ClienteExcluirFeingClient clienteExcluirFeingClient) {
		this.clienteExcluirFeingClient = clienteExcluirFeingClient;
	}

	@Override
	public String excluir(Long codigoCliente) {
	return clienteExcluirFeingClient.excluir(codigoCliente);
	}

}
