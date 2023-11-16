package com.github.ProjetoNinja.service;

import com.github.ProjetoNinja.model.Ninja;
import com.github.ProjetoNinja.repository.NinjaRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private NinjaRepository ninjaRepository;
    public List<Ninja> retornarTodosNinjas(){
        return ninjaRepository.findAll();
    }

    public Optional<Ninja> retornarNinjaPorId(long idDoNinja){
        return ninjaRepository.findById(idDoNinja);
    }

    public Ninja cadastrarNinja(Ninja ninja){
        return ninjaRepository.save(ninja);
    }

    public ResponseEntity<Ninja> atualizarNinja(long id, Ninja novoNinja){
        ResponseEntity<Ninja> response;
        if(ninjaRepository.existsById(id)){
            novoNinja.setIdDoNinja(id);
            response = new ResponseEntity<>(novoNinja, HttpStatus.OK);
        } else{
            response = ResponseEntity.notFound().build();
        }
        return response;
    }
}