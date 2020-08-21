package br.com.redesenhe.models.domains.usuario;

import br.com.redesenhe.models.commons.constantes.Sexo;

import java.io.Serializable;
import java.time.LocalDate;

public class Usuario implements Serializable {

    private Long id;
    private String nome;
    private LocalDate nascimento;
    private Sexo sexo;
    private String email;
    private String senha;
    private LocalDate criacao;
    private LocalDate atualizacao;
}
