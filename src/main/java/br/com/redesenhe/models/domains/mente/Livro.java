package br.com.redesenhe.models.domains.mente;

import br.com.redesenhe.models.commons.constantes.StatusLivro;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;
import java.time.LocalDate;

public class Livro implements Serializable {

    private Long id;
    private String nome;
    private String autor;

    @Enumerated(EnumType.STRING)
    @Column(name = "status",columnDefinition = "varchar(8)", length = 8, nullable = false)
    private StatusLivro status;
    private String resumo;
    private Long idUsuario;
    private LocalDate criacao;
    private LocalDate atualizacao;
}
