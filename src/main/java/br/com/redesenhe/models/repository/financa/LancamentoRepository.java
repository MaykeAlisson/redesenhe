package br.com.redesenhe.models.repository.financa;

import br.com.redesenhe.models.domains.financa.Lancamento;

import java.util.List;
import java.util.Optional;

public interface LancamentoRepository {
    Optional<List<Lancamento>> getLancamentoPorObjetivo(Long idObjetivo);
}
