package br.com.crudbffhexa.adapter.mapper;

import org.mapstruct.Mapper;

import br.com.crudbffhexa.adapter.input.request.ClienteRequest;
import br.com.crudbffhexa.adapter.input.response.ClienteIdResponse;
import br.com.crudbffhexa.adapter.input.response.ClienteResponse;
import br.com.crudbffhexa.domain.entity.ClienteEntity;
import br.com.crudbffhexa.domain.entity.ClienteIdEntity;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

	//Utilizado em ClienteBuscaPorId
	ClienteIdResponse toClienteIdResponse(ClienteIdEntity cliente);

	//Utilizafo em ClienteCriar
	ClienteResponse toClienteResponse(ClienteEntity clienteEntity);

	//Utilizado em ClienteCriar
	ClienteEntity toEntity(ClienteRequest clienteRequest);

}
