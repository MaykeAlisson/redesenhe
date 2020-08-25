package br.com.redesenhe.services.financa;

import br.com.redesenhe.models.domains.financa.Lancamento;

import java.util.List;

public interface LancamentoService {
    List<Lancamento> getLancamentoPorObjetivo(Long idLancamento);
}
