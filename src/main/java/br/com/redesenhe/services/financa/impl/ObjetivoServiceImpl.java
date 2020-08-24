package br.com.redesenhe.services.financa.impl;

import br.com.redesenhe.models.domains.financa.Objetivo;
import br.com.redesenhe.models.repository.financa.ObjetivoRepository;
import br.com.redesenhe.services.financa.ObjetivoService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class ObjetivoServiceImpl implements ObjetivoService {

    @Inject
    private ObjetivoRepository objetivoRepository;

    @Override
    public List<Objetivo> getObjetivosUsuario(final Long idUsuario){

        final Optional<List<Objetivo>> possivelListaObjetivos = objetivoRepository.getObjetivosUsuario(idUsuario);

        return possivelListaObjetivos.orElse(Collections.emptyList());

    }

}
