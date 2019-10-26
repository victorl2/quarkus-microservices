package org.acme.domain.entity;

/**
 * A simple class representing a article
 * 
 * @author Victor Silva
 */
public class Article {
	private Long id;
    private String title;
    private String description;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}