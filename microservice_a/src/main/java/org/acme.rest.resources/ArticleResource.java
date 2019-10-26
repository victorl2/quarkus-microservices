)package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/article")
public class ExampleResource {

    @Inject
    @RestClient
    DatabaseService databaseService;

    @POST
    @Path("v1/{tenant}/{title}")
    @Produces(MediaType.APPLICATION_JSON)
    public String processNewArticle(@PathParam("tenant") String tenant, @PathParam("title") String title) {
        Article newArticle = new Article(title, String.format("This article is destined to the location %s", tenant));
        return databaseService.saveArticle(newArticle);
    }
}