package com.pieropan.elastic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pieropan.elastic.entity.Pessoa;
import com.pieropan.elastic.repository.PessoaRepository;
import com.pieropan.elastic.util.Constante;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Slf4j
@SpringBootApplication
public class ElasticApplication {

    @Autowired
    PessoaRepository pessoaRepository;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) {
        SpringApplication.run(ElasticApplication.class, args);
    }

    @Bean
    public void popularElasticSearch() {
        if (pessoaRepository.countAllBy() == 0) {
            try (BufferedReader fileReader = new BufferedReader(new FileReader("pessoas-payloads.tsv"))) {

                String line;
                List<Pessoa> pessoas = new ArrayList<>(209000);

                while (Objects.nonNull((line = fileReader.readLine()))) {
                    try {
                        Pessoa pessoa = getPessoa(line);
                        pessoas.add(pessoa);
                    } catch (JsonProcessingException e) {
                        System.out.printf((Constante.ERRO_AO_CONVERTER) + "%n", line);
                    }
                }

                pessoaRepository.saveAll(pessoas);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private Pessoa getPessoa(String line) throws JsonProcessingException {
        return objectMapper.readValue(line, Pessoa.class);
    }
}