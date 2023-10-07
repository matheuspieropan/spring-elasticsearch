package com.pieropan.elastic.controller;

import com.pieropan.elastic.dto.PessoaResponse;
import com.pieropan.elastic.service.PessoaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@AllArgsConstructor
@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody PessoaResponse pessoaResponse) {
        return ResponseEntity.status(CREATED).body(pessoaService.cadastrar(pessoaResponse));
    }
}