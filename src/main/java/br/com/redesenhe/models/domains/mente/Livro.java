package br.com.redesenhe.models.domains.mente;

import br.com.redesenhe.models.commons.constantes.StatusLivro;

import java.io.Serializable;
import java.time.LocalDate;

public class Livro implements Serializable {

    private Long id;
    private String nome;
    private String autor;
    private StatusLivro status;
    private String resumo;
    private Long idUsuario;
    private LocalDate criacao;
    private LocalDate atualizacao;
}
