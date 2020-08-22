package br.com.redesenhe.models.domains.usuario;

import br.com.redesenhe.models.commons.constantes.Sexo;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;
import java.time.LocalDate;

public class Usuario implements Serializable {

    private Long id;
    private String nome;
    private LocalDate nascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo", columnDefinition = "enum('F', 'M')", nullable = false)
    private Sexo sexo;
    private String email;
    private String senha;
    private LocalDate criacao;
    private LocalDate atualizacao;
}
