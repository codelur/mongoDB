package com.porttfolio.codelur;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class Movies {

    @Id
    private String id;
    private String title;
    private String rated;
    private String type;
    private List<String> genres;
    private Object awards;
    
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
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	public Object getAwards() {
		return awards;
	}
	public void setAwards(Object awards) {
		this.awards = awards;
	}
	

    // Constructors, getters, and setters
    
}