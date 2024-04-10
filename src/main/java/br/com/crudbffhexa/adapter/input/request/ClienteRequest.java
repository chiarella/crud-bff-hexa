package br.com.crudbffhexa.adapter.input.request;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ClienteRequest {
	
	public ClienteRequest(Long codigoCliente) {
		// TODO Auto-generated constructor stub
	}
	
	@NotNull(message = "O campo nao pode ser nulo e deve ser um campo de texto")
	@Size(min = 3, max = 100, message = "o campo deve ter no minimo 3 e maximo 100 caracteres")
	private String nome;
	private String cpf;

}
