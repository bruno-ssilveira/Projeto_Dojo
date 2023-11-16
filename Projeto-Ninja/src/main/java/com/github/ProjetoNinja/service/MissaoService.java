package com.github.ProjetoNinja.service;

import com.github.ProjetoNinja.model.Missao;
import com.github.ProjetoNinja.repository.MissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissaoService {
    @Autowired
    private MissaoRepository missaoRepository;

    public Missao cadastarMissao(Missao missao) {
        return missaoRepository.save(missao);
    }

    public ResponseEntity<Missao> atualizarMissao(long idDaMissao, Missao novaMissao) {
        ResponseEntity<Missao> response;
        if(missaoRepository.existsById(idDaMissao)) {
            novaMissao.setIdDaMissao(idDaMissao);
            response = ResponseEntity.ok(novaMissao);
        } else {
            response = ResponseEntity.notFound().build();
        }
        return response;
    }

    public Optional<Missao> retornarMissaoPorId(long id) {
        return missaoRepository.findById(id);
    }
    public List<Missao> retornarTodasMissoes(){
        return missaoRepository.findAll();
    }

}
