package br.com.redesenhe.models.repository.financa;

import br.com.redesenhe.models.domains.financa.Objetivo;

import java.util.List;
import java.util.Optional;

public interface ObjetivoRepository {
    Optional<List<Objetivo>> getObjetivosUsuario(Long idUsuario);
}
