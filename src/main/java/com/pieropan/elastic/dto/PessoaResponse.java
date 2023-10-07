package com.pieropan.elastic.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PessoaResponse extends PessoaRequest {

    private Long id;
}