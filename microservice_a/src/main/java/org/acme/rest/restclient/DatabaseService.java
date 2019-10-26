package org.acme.rest.restclient;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.domain.entity.Article;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/article/")
@RegisterRestClient
public interface DatabaseService {

    @POST
    @Path("{tenant}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    /**
     * This {@link @RestClient} service saves the new {@link Article} 
     * calling the url htt://localhost:8082/v1/{tenant}/
     * @param tenant defines where in the database this will be saved
     * @param newArticle is the new article generated
     * @return a article with a id from the database
     */
    Article saveArticle(@PathParam("tenant") String tenant, Article newArticle);
    
    @GET
	@Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * Get a single {@link Article} by its id
     * @param id of the article 
     * @return A {@link Article}
     */
	Article getArticleById(@PathParam("id")Long id);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	/**
	 * @return a {@link List} with all {@link Article} saved on the database
	 */
	List<Article> getAllArticles();
}