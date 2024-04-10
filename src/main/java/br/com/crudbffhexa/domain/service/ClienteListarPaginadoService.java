package br.com.crudbffhexa.domain.service;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.crudbffhexa.domain.entity.PaginacaoEntity;
import br.com.crudbffhexa.port.input.ClienteListarPaginadoUseCase;
import br.com.crudbffhexa.port.output.ClienteListarPaginadoFeignClient;

@Service
public class ClienteListarPaginadoService implements ClienteListarPaginadoUseCase {

	private final ClienteListarPaginadoFeignClient clienteListarPaginadoFeignClient;
	
	public ClienteListarPaginadoService(ClienteListarPaginadoFeignClient clienteListarPaginadoFeignClient) {
		this.clienteListarPaginadoFeignClient = clienteListarPaginadoFeignClient;
	}

	@Override
	public PaginacaoEntity buscar(Pageable page, Integer codigoCliente) {
	return clienteListarPaginadoFeignClient.listar(page, codigoCliente);
	}

}
