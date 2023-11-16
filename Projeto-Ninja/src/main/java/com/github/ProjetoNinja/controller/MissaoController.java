package com.github.ProjetoNinja.controller;

import com.github.ProjetoNinja.model.Missao;
import com.github.ProjetoNinja.service.MissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/missoes")
public class MissaoController {
    @Autowired
    private MissaoService missaoService;

    @GetMapping
    public List<Missao> getAllMissoes() {
        return missaoService.getTodasMissoes();
    }

    @PostMapping("add")
    public Missao postMissao(@RequestParam(value = "missao", defaultValue = "missao default") String missao, @RequestParam(value = "feita", defaultValue = "naoFeita") boolean done) {
        Missao novaMissao = new Missao();
        novaMissao.s
    }

}
