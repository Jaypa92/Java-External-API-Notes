package com.justin.APIlearning.Models;

import java.util.List;
/* Since the data is going to be sent back as an object in a list, the PokemonList class
 * needs to be created*/
public class PokemonList {
	private List<Pokemon> results;

	public List<Pokemon> getResults() {
		return results;
	}

	public void setResults(List<Pokemon> results) {
		this.results = results;
	}
	
	
}
