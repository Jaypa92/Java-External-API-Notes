package com.justin.APIlearning.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.justin.APIlearning.Models.PokemonList;

/* The Pokemon Service needs to be created to contain methods to be used in other classes.*/
@Service
public class PokemonService {
	/* The variable pokemonURL is set to the link of where the data will be retrieved from*/
	private final String pokemonUrl = "https://pokeapi.co/api/v2/pokemon/";
	/* RestTemplate is then imported from the AppConfiguration class which is located in
	 * the same package as the main file for the application*/
	@Autowired
	private RestTemplate restTemplate;
	/* RestTemplate is then used along with it's method getForObject which takes two 
	 * arguments. One being the URL for the external API, and the other being the Model 
	 * class being used for the data */
	public PokemonList getAllPokemon() {
		return restTemplate.getForObject(pokemonUrl, PokemonList.class);
	}
}
