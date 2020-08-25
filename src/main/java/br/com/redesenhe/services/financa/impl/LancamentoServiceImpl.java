package br.com.redesenhe.services.financa.impl;

import br.com.redesenhe.models.domains.financa.Lancamento;
import br.com.redesenhe.models.repository.financa.LancamentoRepository;
import br.com.redesenhe.services.financa.LancamentoService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class LancamentoServiceImpl implements LancamentoService {

    @Inject
    LancamentoRepository lancamentoRepository;

    @Override
    public List<Lancamento> getLancamentoPorObjetivo(final Long idLancamento){

        final Optional<List<Lancamento>> possivelListaLancamento = lancamentoRepository.getLancamentoPorObjetivo(idLancamento);

        return possivelListaLancamento.orElse(Collections.emptyList());

    }
}
