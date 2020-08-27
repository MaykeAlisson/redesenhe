package br.com.redesenhe.models.domains.financa;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "objetivo")
public class Objetivo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint", nullable = false)
    private Long id;

    @NotEmpty
    @NotNull
    @Column(name = "nome", columnDefinition = "varchar(150)", length = 150, nullable = false)
    private String nome;

    @NotEmpty
    @NotNull
    @Column(name = "objetivo", columnDefinition = "decimal", nullable = false)
    private BigDecimal objetivo;

    @NotEmpty
    @NotNull
    @Column(name = "idUsuario", columnDefinition = "bigint", nullable = false)
    private Long idUsuario;

    @Column(name = "criacao", columnDefinition = "DATE", nullable = false)
    private LocalDate criacao;

    @Column(name = "atualizacao", columnDefinition = "DATE", nullable = false)
    private LocalDate atualizacao;
}
