package org.acme.rest.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.domain.entity.Article;

@Path("/article/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ArticleResource {
		
	@GET
	@Path("{id}")
	public Article getArticleById(@PathParam("id")Long id) {
		return Article.findById(id);
	}
	
	@GET
	public List<Article> getAllArticles(){
		return Article.listAll();
	}

    @POST
    @Path("{tenant}")
    @Produces(MediaType.TEXT_PLAIN)
    public Article saveNewArticle(@PathParam("tenant") final String tenant, Article article) {
    	article.persist();
        return article;
    }
    
    
}