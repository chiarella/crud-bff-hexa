package br.com.crudbffhexa.domain.entity;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ClienteListarPaginadoEntity {
	
	private Long codigoCliente;
	private String nome;
	private String cpf;

}
