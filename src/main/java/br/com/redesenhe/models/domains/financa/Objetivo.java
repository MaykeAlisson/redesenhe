package br.com.redesenhe.models.domains.financa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Objetivo implements Serializable {

    private Long id;
    private String nome;
    private List<Lancamento> lancamentos;
    private BigDecimal objetivo;
    private BigDecimal vlrAtual;
    private Long idUsuario;
    private LocalDate criacao;
    private LocalDate atualizacao;
}
