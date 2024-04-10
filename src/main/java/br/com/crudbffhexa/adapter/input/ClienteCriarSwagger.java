package br.com.crudbffhexa.adapter.input;

import java.net.BindException;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.crudbffhexa.adapter.exception.GlobalExceptionHandler;
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
    @ApiResponse(responseCode = "201", content = { 
    			@Content(schema = @Schema(implementation = ClienteResponse.class), mediaType = "application/json") 
    			}),
    @ApiResponse(responseCode = "400", content = { 
    			@Content(schema = @Schema(implementation = GlobalExceptionHandler.class)) 
    }) 
})
@RequestMapping(value = "/v1/cliente")
public interface ClienteCriarSwagger {
	
	@Operation(operationId = "criar cliente", summary = "criar um cliente na base", description = "endpoint para criar um cliente na base")
	@PostMapping()
	ResponseEntity<ClienteResponse> criarCliente(@Valid @RequestBody ClienteRequest clienteRequest) throws BindException;


}
