package br.com.crudbffhexa.adapter.input.resource;

import java.net.BindException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.crudbffhexa.adapter.input.ClienteCriarSwagger;
import br.com.crudbffhexa.adapter.input.request.ClienteRequest;
import br.com.crudbffhexa.adapter.input.response.ClienteResponse;
import br.com.crudbffhexa.adapter.mapper.ClienteMapper;
import br.com.crudbffhexa.domain.entity.ClienteEntity;
import br.com.crudbffhexa.port.input.ClienteCriarUseCase;
import jakarta.validation.Valid;

@RestController
public class ClienteCriarController implements ClienteCriarSwagger{
	
	private final ClienteCriarUseCase clienteCriarUseCase;
	private final ClienteMapper clienteMapper;
	
	public ClienteCriarController(
			ClienteCriarUseCase clienteCriarUseCase, 
			ClienteMapper clienteMapper) {
		this.clienteCriarUseCase = clienteCriarUseCase;
		this.clienteMapper = clienteMapper;
	}



	@Override
	public ResponseEntity<ClienteResponse> criarCliente(@Valid ClienteRequest clienteRequest) throws BindException {
		ClienteEntity clienteEntity = clienteCriarUseCase.criarCliente(clienteMapper.toEntity(clienteRequest));
		return new ResponseEntity<>(clienteMapper.toClienteResponse(clienteEntity), HttpStatus.CREATED);
	}

}
