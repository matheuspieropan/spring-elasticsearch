package com.pieropan.elastic.mapper;

import com.pieropan.elastic.dto.PessoaRequest;
import com.pieropan.elastic.dto.PessoaResponse;
import com.pieropan.elastic.entity.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PessoaMapper {

    PessoaMapper INSTANCE = Mappers.getMapper(PessoaMapper.class);

    @Mapping(target = "id", ignore = true)
    Pessoa toPessoa(PessoaRequest pessoaRequest);

    PessoaResponse toPessoaResponse(Pessoa pessoa);
}