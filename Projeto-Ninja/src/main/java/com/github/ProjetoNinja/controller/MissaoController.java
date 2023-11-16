package com.github.ProjetoNinja.controller;

import com.github.ProjetoNinja.model.Missao;
import com.github.ProjetoNinja.service.MissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/missoes")
public class MissaoController {
    @Autowired
    private MissaoService missaoService;

    @GetMapping
    public List<Missao> retornarTodasMissoes() {
        return missaoService.retornarTodasMissoes();
    }

    @PostMapping("/add")
    public Missao postMissao(@RequestBody Missao missao) {
        return missaoService.cadastarMissao(missao);
    }

}
