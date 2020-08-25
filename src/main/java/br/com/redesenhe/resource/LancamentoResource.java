package br.com.redesenhe.resource;

import br.com.redesenhe.models.domains.financa.Lancamento;
import br.com.redesenhe.services.financa.LancamentoService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@ApplicationScoped
@Path("/api/lancamento")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LancamentoResource {

    @Inject
    private LancamentoService lancamentoService;

    @GET
    @Path("/v1/lancamento")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Lancamento> getLancamentoPorObjetivo(){

        Long idObjetivo = 1L;
       return lancamentoService.getLancamentoPorObjetivo(idObjetivo);
    }



}
