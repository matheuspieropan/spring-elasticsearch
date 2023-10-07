package com.pieropan.elastic.dto;

import lombok.Data;

import java.util.List;

@Data
public class PessoaRequest {

    private String nome;

    private String apelido;

    private String nascimento;

    private List<String> stack;
}