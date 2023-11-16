package com.github.ProjetoNinja.controller;

import com.github.ProjetoNinja.model.Ninja;
import com.github.ProjetoNinja.service.NinjaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ninjas")
public class NinjaController {
    private NinjaService ninjaService;

    @GetMapping
    public List<Ninja> retornarNinjas(){
        return ninjaService.retornarTodosNinjas();
    }

    @GetMapping("/{id}")
    public Optional<Ninja> getNinjaById(long id) {
        return ninjaService.retornarNinjaPorId(id);
    }

    @PostMapping("/add")
    public Ninja criarNinja(@RequestBody Ninja ninja) {
        return ninjaService.cadastrarNinja(ninja);
    }

    @PutMapping("/altera/{id}")
    public ResponseEntity<Ninja> alteraNinja(long id,@RequestBody Ninja ninja) {
        return ninjaService.atualizarNinja(id, ninja);
    }
}