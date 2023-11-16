package com.github.ProjetoNinja.service;

import com.github.ProjetoNinja.model.Missao;
import com.github.ProjetoNinja.repository.MissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissaoService {
    @Autowired
    private MissaoRepository missaoRepository;

    public Missao criarMissao(Missao missao) {
        return missaoRepository.save(missao);
    }

    public Missao atualizarMissao(Long id, Missao novaMissao) {
        if(missaoRepository.existsById(id)) {
            novaMissao.setId(id);
            return missaoRepository.save(novaMissao);
        }
        return null;
    }

    public Optional<Missao> pegarMissao(Long id) {
        return missaoRepository.findById(id);
    }
    public List<Missao> getTodasMissoes(){
        return missaoRepository.findAll();
    }




}
