package br.com.redesenhe.resource;

import br.com.redesenhe.models.domains.financa.Objetivo;
import br.com.redesenhe.services.financa.ObjetivoService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
@Path("/api/objetivo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ObjetivoResource {

    @Inject
    private final ObjetivoService objetivoService;

    public ObjetivoResource(
            final ObjetivoService objetivoService
    ) {
        this.objetivoService = objetivoService;
    }

    @GET
    @Path("/v1/objetivo")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Objetivo> getObjetivosUsuario() {
        Long idUsuario = 1L;

        List<Objetivo> listaObjetivos = objetivoService.getObjetivosUsuario(idUsuario);

        return listaObjetivos;
    }

    @POST
    @Path("/v1/objetivo")
    @Produces("application/json")
    public Response addProduct(Objetivo objetivo) {
//        productService.addProduct(product);
        return Response.ok().build();
    }
}
