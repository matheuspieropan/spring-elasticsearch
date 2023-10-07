package com.pieropan.elastic;

import com.pieropan.elastic.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElasticApplication {

    @Autowired
    PessoaRepository pessoaRepository;

    public static void main(String[] args) {
        SpringApplication.run(ElasticApplication.class, args);
    }
}