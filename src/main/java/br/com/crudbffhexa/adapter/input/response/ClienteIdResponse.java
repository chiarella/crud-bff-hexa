package br.com.crudbffhexa.adapter.input.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClienteIdResponse {
	
	private Long codigoCliente;
	private String nome;
	private String cpf;
	
	public ClienteIdResponse(Long codigoCliente, String cpf) {
		this.codigoCliente = codigoCliente;
		this.cpf = cpf;
	}

}
