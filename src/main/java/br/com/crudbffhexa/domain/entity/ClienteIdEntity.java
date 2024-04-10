package br.com.crudbffhexa.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClienteIdEntity {

	private Long codigoCliente;
	private String nome;
	private String cpf;

}
