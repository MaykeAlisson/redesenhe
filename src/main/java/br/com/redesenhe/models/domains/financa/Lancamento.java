package br.com.redesenhe.models.domains.financa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Lancamento implements Serializable {

    private Long id;
    private BigDecimal valor;
    private String origem;
    private String destino;
    private Long idObjetivo;
    private LocalDate criacao;
    private LocalDate atualizacao;
}
