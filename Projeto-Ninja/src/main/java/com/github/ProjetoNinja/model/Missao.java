
package com.github.ProjetoNinja.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "missoes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Missao {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   @NonNull
    private String dificuldade;
   @NonNull
    private String tipoDaMissao;
   @NonNull
    private boolean concluida;
}