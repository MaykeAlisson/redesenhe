package br.com.redesenhe.models.repository.financa.impl;

import br.com.redesenhe.models.domains.financa.Objetivo;
import br.com.redesenhe.models.repository.financa.ObjetivoRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class ObjetivoRepositoryImp implements ObjetivoRepository {

    @Override
    public Optional<List<Objetivo>> getObjetivosUsuario(final Long idUsuario){

        return Optional.empty();
    }
}
