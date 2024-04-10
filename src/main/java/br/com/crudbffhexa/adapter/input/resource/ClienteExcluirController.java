package br.com.crudbffhexa.adapter.input.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.crudbffhexa.adapter.input.ClienteExcluirSwagger;
import br.com.crudbffhexa.adapter.input.response.MensagemResponse;
import br.com.crudbffhexa.port.input.ClienteExcluirUseCase;

@RestController
public class ClienteExcluirController implements ClienteExcluirSwagger {
	
	private final ClienteExcluirUseCase clienteExcluirUseCase;
	
	public ClienteExcluirController(ClienteExcluirUseCase clienteExcluirUseCase) {
		this.clienteExcluirUseCase = clienteExcluirUseCase;
	}

	@Override
	public ResponseEntity<MensagemResponse> excluirCliente(Long codigoCliente) {
		return ResponseEntity.ok(new MensagemResponse(clienteExcluirUseCase.excluir(codigoCliente)));
	}

}


