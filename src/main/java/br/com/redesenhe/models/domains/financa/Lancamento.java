package br.com.redesenhe.models.domains.financa;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "lancamento")
public class Lancamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint", nullable = false)
    private Long id;

    @Column(name = "valor", columnDefinition = "decimal", nullable = false)
    @NotNull( message = "Valor" )
    private BigDecimal valor;

    @Column(name = "origem", columnDefinition = "varchar(70)", length = 70, nullable = false)
    private String origem;

    @Column(name = "destino", columnDefinition = "varchar(70)", length = 70, nullable = false)
    private String destino;

    @Column(name = "idObjetivo", columnDefinition = "bigint", nullable = false)
    private Long idObjetivo;

    @Column(name = "criacao", columnDefinition = "DATE", nullable = false)
    private LocalDate criacao;

    @Column(name = "atualizacao", columnDefinition = "DATE", nullable = false)
    private LocalDate atualizacao;
}
