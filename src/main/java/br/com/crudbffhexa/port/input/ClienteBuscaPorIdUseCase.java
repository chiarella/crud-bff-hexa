package br.com.crudbffhexa.port.input;

import br.com.crudbffhexa.domain.entity.ClienteIdEntity;

public interface ClienteBuscaPorIdUseCase {

	ClienteIdEntity buscar(Long codigoCliente);

}
