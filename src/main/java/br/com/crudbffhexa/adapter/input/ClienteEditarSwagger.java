package br.com.crudbffhexa.adapter.input;

import java.net.BindException;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.crudbffhexa.adapter.input.request.ClienteRequest;
import br.com.crudbffhexa.adapter.input.response.ClienteResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Validated
@Tag(name = "Cliente", description = "Serviço de cliente")
@ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "Cliente alterado com sucesso", content = { 
    			@Content(mediaType = "application/json", schema = @Schema(implementation = ClienteResponse.class)) 
    			}),
    @ApiResponse(responseCode = "400", description = "Cliente 400", content = { 
    			@Content(mediaType = "application/json", schema = @Schema(implementation = ClienteResponse.class)) 
    }) 
})
@RequestMapping(value = "/v1/cliente")
public interface ClienteEditarSwagger {

	@Operation(operationId = "editarCliente", summary = "editar um cliente na base", description = "endpoint para editar um cliente na base")
	@PutMapping("/{codigoCliente}")
	ResponseEntity<ClienteResponse> criarCliente(
			@PathVariable Long codigoCliente, @Valid @RequestBody ClienteRequest clienteRequest) throws BindException;

}