package com.pieropan.elastic.service;

import com.pieropan.elastic.dto.PessoaResponse;
import com.pieropan.elastic.entity.Pessoa;
import com.pieropan.elastic.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.pieropan.elastic.mapper.PessoaMapper.INSTANCE;

@AllArgsConstructor
@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;

    public PessoaResponse cadastrar(PessoaResponse pessoaResponse) {
        Pessoa pessoa = pessoaRepository.save(INSTANCE.toPessoa(pessoaResponse));
        return INSTANCE.toPessoaResponse(pessoa);
    }
}