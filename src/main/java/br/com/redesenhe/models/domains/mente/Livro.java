package br.com.redesenhe.models.domains.mente;

import br.com.redesenhe.models.commons.constantes.StatusLivro;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "livro")
public class Livro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint", nullable = false)
    private Long id;

    @Column(name = "nome", columnDefinition = "varchar(70)", length = 70, nullable = false)
    private String nome;

    @Column(name = "autor", columnDefinition = "varchar(70)", length = 70, nullable = false)
    private String autor;

    @Enumerated(EnumType.STRING)
    @Column(name = "status",columnDefinition = "varchar(8)", length = 8, nullable = false)
    private StatusLivro status;

    @Column(name = "resumo", columnDefinition = "varchar(200)", length = 200)
    private String resumo;

    @Column(name = "idUsuario", columnDefinition = "bigint", nullable = false)
    private Long idUsuario;

    @Column(name = "criacao", columnDefinition = "DATE", nullable = false)
    private LocalDate criacao;

    @Column(name = "atualizacao", columnDefinition = "DATE", nullable = false)
    private LocalDate atualizacao;
}
