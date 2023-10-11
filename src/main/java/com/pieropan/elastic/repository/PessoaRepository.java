package com.pieropan.elastic.repository;

import com.pieropan.elastic.entity.Pessoa;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends ElasticsearchRepository<Pessoa, Long> {
    long countAllBy();
}