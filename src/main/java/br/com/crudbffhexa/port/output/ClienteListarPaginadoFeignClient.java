package br.com.crudbffhexa.port.output;

import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.crudbffhexa.domain.entity.PaginacaoEntity;

@FeignClient(name = "clienteListar", url = "http://localhost:8088")
public interface ClienteListarPaginadoFeignClient {

	@GetMapping("/v1/cliente")
	PaginacaoEntity listar(@PageableDefault(page = 0, size = 10)
			Pageable page, @RequestParam Integer codigoCliente);


}
