import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;


public class PokeProcessor {

    private List<Pokemon> pokemons;

    public void loadPokemons(Optional<String> pathOpt) throws IOException, URISyntaxException {
        try{
            String path = pathOpt.orElse("pokeData.json");
            URL url = this.getClass().getClassLoader().getResource(path);
            String jsonString = new String(Files.readAllBytes(Paths.get(url.toURI())));
            ObjectMapper objectMapper = new ObjectMapper();
            TypeFactory typeFactory = objectMapper.getTypeFactory();
            pokemons = objectMapper.readValue(jsonString, typeFactory.constructCollectionType(List.class, Pokemon.class));


        } catch(Exception e){
            throw(e);
        }
    }
    public Integer getPokemonCount(){
        return pokemons.size();
    }
    // list all Pokemon by name
    public ArrayList<String> listPokemon() {
        return new ArrayList<String>();
    }

    // return an array of Pokemon that have 3 weaknesses
    public ArrayList<Pokemon> pokemonWith3Weaknesses() {
        return new ArrayList<Pokemon>();
    }


    // average MaxHP
    public Integer calculateAverageMaxHP() {
        return 0;
    }

    // list all weaknesses
    public ArrayList<String> listWeaknesses() {
        return new ArrayList<String>();
    }

    // Pokemon resistant to a supplied type of attack
    public ArrayList<Pokemon> pokemonResistantByAttackType(String attack) {
        return new ArrayList<Pokemon>();
    }

    // Map of attack types and the number of Pokemon resistant to each type of attack
    public Map<String, Integer> numOfPokemonResistantByAttackType() {
        return new HashMap<String,Integer>();
    }

    // list types of fast attacks
    public ArrayList<String> typesOfFastAttacks() {
        return new ArrayList<String>();
    }

    // list of Pokemon that have more than three special attacks
    public ArrayList<Pokemon> specialAttacksPokemon() {
        return new ArrayList<Pokemon>();
    }

    // % of Pokemon that have >50kg maximum mass
    public Double heavyPokemon() {
        return 0.0;
    }


    // accept the index of a Pokemon and return an object of name, description and array of next evolutions
    public Object describePokemonByNumber(Integer number) {
        return new Object();
    }
}

