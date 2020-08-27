package br.com.redesenhe.resource;

import br.com.redesenhe.models.domains.financa.Objetivo;
import br.com.redesenhe.services.financa.ObjetivoService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

import static javax.ws.rs.core.Response.Status.CREATED;
import static javax.ws.rs.core.Response.status;

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
    @Transactional
    public Response addObjetivo(@Valid Objetivo objetivo) {
//        productService.addProduct(product);
        return status(CREATED).build();
    }

    @PUT
    @Path("/v1/objetivo/{id}")
    @Transactional
    public Response updateObjetivo(@PathParam("id") Long id, Objetivo objetivo) {
//        productService.addProduct(product);
        return Response.ok().build();
    }

    @DELETE
    @Path("/v1/objetivo/{id}")
    @Produces("application/json")
    @Transactional
    public Response deleteObjetivo(@PathParam("id") Long id) {
//        productService.addProduct(product);
        return Response.ok().build();
    }
}
