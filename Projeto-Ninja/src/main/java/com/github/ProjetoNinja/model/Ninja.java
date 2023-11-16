package com.github.ProjetoNinja.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "ninjas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDoNinja;
    @NonNull
    private String nome;
    @NonNull
    private String vila;
    @NonNull
    private String nivel;
    private boolean ativo;
}