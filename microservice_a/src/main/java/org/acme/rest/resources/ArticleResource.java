package org.acme.rest.resources;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.domain.entity.Article;
import org.acme.rest.restclient.DatabaseService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/article/v1/")
public class ArticleResource {

    @Inject
    @RestClient
    DatabaseService databaseService;

    @POST
    @Path("{tenant}/{title}")
    @Produces(MediaType.APPLICATION_JSON)
    public Article processNewArticle(@PathParam("tenant") String tenant, @PathParam("title") String title) {
        Article newArticle = new Article(title, String.format("This article is destined to the location %s", tenant));
        return databaseService.saveArticle(tenant,newArticle);
    }
}