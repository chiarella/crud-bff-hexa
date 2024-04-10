package br.com.crudbffhexa.adapter.input;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.crudbffhexa.adapter.input.response.PaginacaoResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;



@Validated
@Tag(name = "Cliente", description = "Serviço de cliente")
@ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "Lista de Cliente Paginada", content = { 
    			@Content(mediaType = "application/json", schema = @Schema(implementation = PaginacaoResponse.class)) 
    }),
})
@RequestMapping(value = "/v1/cliente")
public interface ClienteListarPaginadoSwagger {

	@Operation(operationId = "criar cliente", summary = "criar um cliente na base", description = "endpoint para criar um cliente na base")
	@GetMapping()
	ResponseEntity<PaginacaoResponse> filtrar(@PageableDefault(page = 0, size = 10)Pageable page,
											  @RequestParam(required = false) Integer codigoCliente);
	

}
