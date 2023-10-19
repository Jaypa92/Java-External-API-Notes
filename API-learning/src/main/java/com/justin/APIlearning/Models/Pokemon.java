package com.justin.APIlearning.Models;
/*A class for the Pokemon needs to be created to decide what kind of information is going 
 * to be used for the object from the API */
public class Pokemon {
	private String name;
	private String url;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
