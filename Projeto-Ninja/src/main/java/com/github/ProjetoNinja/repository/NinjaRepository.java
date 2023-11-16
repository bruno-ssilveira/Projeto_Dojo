package com.github.ProjetoNinja.repository;

import com.github.ProjetoNinja.model.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja,Long> {
}
