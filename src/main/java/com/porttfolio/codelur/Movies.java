package com.porttfolio.codelur;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class Movies {

    @Id
    private String id;
    private String title;
    private String rated;
    private String type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRated() {
		return rated;
	}
	public void setRated(String rated) {
		this.rated = rated;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

    // Constructors, getters, and setters
    
}