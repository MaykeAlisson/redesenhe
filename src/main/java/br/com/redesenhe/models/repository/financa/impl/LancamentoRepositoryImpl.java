package br.com.redesenhe.models.repository.financa.impl;

import br.com.redesenhe.models.domains.financa.Lancamento;
import br.com.redesenhe.models.repository.financa.LancamentoRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class LancamentoRepositoryImpl implements LancamentoRepository {

    @Override
    public Optional<List<Lancamento>> getLancamentoPorObjetivo(final Long idObjetivo){
        return Optional.empty();
    }
}
