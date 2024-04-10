package br.com.crudbffhexa.port.input;

import br.com.crudbffhexa.domain.entity.ClienteIdEntity;

public interface ClienteEditarUseCase {
	
	ClienteIdEntity editar(Long codigoCliente, String nome, String cpf);


}
