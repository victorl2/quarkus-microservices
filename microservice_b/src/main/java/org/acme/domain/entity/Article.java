package org.acme.domain.entity;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

/**
 * A simple class representing a article
 * 
 * @author Victor Silva
 */
@Entity(name = "Article")
public class Article extends PanacheEntity{
    private String title;
    private String description;
    private String contentBody;

    public Article(){}

    public Article(String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getTitle(){
        return this.title;
    }

    public String getDescription(){
        return this.description;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

	public String getContentBody() {
		return contentBody;
	}

	public void setContentBody(String contentBody) {
		this.contentBody = contentBody;
	}
}