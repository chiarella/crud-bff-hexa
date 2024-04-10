package br.com.crudbffhexa.adapter.mapper;

import org.mapstruct.Mapper;

import br.com.crudbffhexa.adapter.input.response.PaginacaoResponse;
import br.com.crudbffhexa.domain.entity.PaginacaoEntity;

@Mapper(componentModel = "spring")
public interface PaginacaoMapper {
	
	PaginacaoResponse toEntity(PaginacaoEntity paginacaoEntity);

}
