package br.com.redesenhe.services.financa;

import br.com.redesenhe.models.domains.financa.Objetivo;

import java.util.List;

public interface ObjetivoService {
    List<Objetivo> getObjetivosUsuario(Long idUsuario);
}
