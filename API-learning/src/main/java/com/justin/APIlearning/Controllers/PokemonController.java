package com.justin.APIlearning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.justin.APIlearning.Models.PokemonList;
import com.justin.APIlearning.Services.PokemonService;

/* In the controller here, we've listed the routing as well as importing the 
 * PokemonService to use the getAllPokemon method to get the list of Pokemon*/
@RestController
@RequestMapping("/pokemon")
public class PokemonController {
	@Autowired
	private PokemonService pokeServ;
	
	@GetMapping("/list")
	public PokemonList getAllPokemon() {
		return pokeServ.getAllPokemon();
	}
}
