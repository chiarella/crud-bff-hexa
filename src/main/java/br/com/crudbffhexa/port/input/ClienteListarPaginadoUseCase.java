package br.com.crudbffhexa.port.input;

import org.springframework.data.domain.Pageable;

import br.com.crudbffhexa.domain.entity.PaginacaoEntity;

public interface ClienteListarPaginadoUseCase {

	PaginacaoEntity buscar(Pageable page, Integer codigoCliente);

}
