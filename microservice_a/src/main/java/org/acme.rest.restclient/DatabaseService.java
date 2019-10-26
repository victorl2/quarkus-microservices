package org.acme.restclient;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.Set;

@Path("/v2")
@RegisterRestClient
public interface DatabaseService {

    @POST
    @Path("/{tenant}")
    @Produces(MediaType.APPLICATION_JSON)
    Article saveArticle(@PathParam("tenant") String tenant, Article newArticle);
}