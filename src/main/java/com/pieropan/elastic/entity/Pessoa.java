package com.pieropan.elastic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "pessoa")
public class Pessoa {

    @Id
    private Long id;

    private String nome;

    private String apelido;

    @Field(type = FieldType.Text)
    private String nascimento;

    private List<String> stack = new ArrayList<>();
}