package br.com.crudbffhexa.adapter.input;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.crudbffhexa.adapter.exception.GlobalExceptionHandler;
import br.com.crudbffhexa.adapter.input.response.ClienteIdResponse;
import br.com.crudbffhexa.adapter.input.response.ClienteResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@Validated
@Tag(name = "Cliente", description = "Serviço de cliente")
@ApiResponses(value = {
    @ApiResponse(responseCode = "200", description ="Cliente localizado com sucesso",  content = { 
    			@Content(schema = @Schema(implementation = ClienteResponse.class), mediaType = "application/json") 
    			}),
    @ApiResponse(responseCode = "404", content = { 
    			@Content(schema = @Schema(implementation = GlobalExceptionHandler.class)) 
    }) 
})
@RequestMapping(value = "/v1/cliente") //, produces = MediaType.APPLICATION_JSON_VALUE)
public interface ClienteBuscaPorIdSwagger {
	
	@Operation(operationId = "buscarClientePorID", summary = "buscar um cliente na base", description = "endpoint para buscar um cliente na base")
	@GetMapping("/{codigoCliente}")
	ResponseEntity<ClienteIdResponse>  buscar(@PathVariable Long codigoCliente);

}