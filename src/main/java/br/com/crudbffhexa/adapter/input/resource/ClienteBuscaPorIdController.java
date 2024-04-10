package br.com.crudbffhexa.adapter.input.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.crudbffhexa.adapter.input.ClienteBuscaPorIdSwagger;
import br.com.crudbffhexa.adapter.input.response.ClienteIdResponse;
import br.com.crudbffhexa.adapter.mapper.ClienteMapper;
import br.com.crudbffhexa.domain.entity.ClienteIdEntity;
import br.com.crudbffhexa.port.input.ClienteBuscaPorIdUseCase;

@RestController
public class ClienteBuscaPorIdController implements ClienteBuscaPorIdSwagger {

	private final ClienteBuscaPorIdUseCase clienteBuscaPorIdUseCase;
	private final ClienteMapper clienteMapper;
	
	public ClienteBuscaPorIdController(
			ClienteBuscaPorIdUseCase clienteBuscaPorIdUseCase,
			ClienteMapper clienteMapper) {
		this.clienteBuscaPorIdUseCase = clienteBuscaPorIdUseCase;
		this.clienteMapper = clienteMapper;
	}

	@Override
	public ResponseEntity<ClienteIdResponse> buscar(Long codigoCliente) {
		ClienteIdEntity cliente = clienteBuscaPorIdUseCase.buscar(codigoCliente);
		return ResponseEntity.ok(clienteMapper.toClienteIdResponse(cliente));
	}

}