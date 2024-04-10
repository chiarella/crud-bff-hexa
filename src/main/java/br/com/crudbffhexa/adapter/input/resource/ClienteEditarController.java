package br.com.crudbffhexa.adapter.input.resource;

import java.net.BindException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.crudbffhexa.adapter.input.ClienteEditarSwagger;
import br.com.crudbffhexa.adapter.input.request.ClienteRequest;
import br.com.crudbffhexa.adapter.input.response.ClienteIdResponse;
import br.com.crudbffhexa.adapter.input.response.ClienteResponse;
import br.com.crudbffhexa.domain.entity.ClienteIdEntity;
import br.com.crudbffhexa.port.input.ClienteEditarUseCase;
import jakarta.validation.Valid;

@RestController
public class ClienteEditarController implements ClienteEditarSwagger {

	private final ClienteEditarUseCase clienteEditarUseCase;
	private final Validator validator;
	
	public ClienteEditarController(
			ClienteEditarUseCase clienteEditarUseCase,
			Validator validator) {
		this.clienteEditarUseCase = clienteEditarUseCase;
		this.validator = validator;
	}


	@Override
	public ResponseEntity<ClienteResponse> criarCliente(@PathVariable Long codigoCliente, @Valid ClienteRequest clienteRequest) throws BindException {
		
		ClienteRequest request = new ClienteRequest(codigoCliente);
		request.setNome(clienteRequest.getNome());
		
		DataBinder binder = new DataBinder(request);
		binder.setValidator(validator);
		binder.validate();
		
		BindingResult result = binder.getBindingResult();
		
		if(result.hasErrors()) {
			throw new BindException(result.toString());
		}
		
		ClienteIdEntity clienteEntity = clienteEditarUseCase.editar(codigoCliente, clienteRequest.getNome(), clienteRequest.getCpf());
		ClienteIdResponse clienteResponse = new ClienteIdResponse(clienteEntity.getCodigoCliente(), clienteEntity.getNome(), clienteEntity.getCpf());
		
		return new ResponseEntity(clienteResponse, HttpStatus.OK);
		
	}
	
}

