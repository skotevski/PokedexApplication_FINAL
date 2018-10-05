package com.example.stevenkotevski.pokedexapplication;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class PokemonLab {
    private static PokemonLab sPokemonLab;

    private List<Pokemon> mPokemon;

    public static PokemonLab get(Context context) {
        if (sPokemonLab == null) {
            sPokemonLab = new PokemonLab(context);
        }
        return sPokemonLab;
    }

    // For the recyclerview, include the name of all the pokemon,
    // Once you tap on one, and open up the new fragment, include other attributes and call image resource using R.mipmap___

    private PokemonLab(Context context) {
        mPokemon = new ArrayList<>();


     // Creating and setting the pokemon for the application:

        Pokemon pikachu = new Pokemon();
        pikachu.setmName("Pikachu");
        pikachu.setmAttack(55);
        pikachu.setmCategory("Electric");
        pikachu.setmDefense(40);
        pikachu.setmHeight("1 Ft, 4 In");
        pikachu.setmHP(35);
        pikachu.setmImageResource(R.mipmap.pikachu);
        pikachu.setmSpecialAttack(50);
        pikachu.setmSpecialDefense(50);
        pikachu.setmSpeed(90);
        pikachu.setmWeight("13.2 lbs");
        mPokemon.add(pikachu);


        Pokemon salamence = new Pokemon();
        salamence.setmName("Salamence");
        salamence.setmAttack(135);
        salamence.setmCategory("Dragon / Flying");
        salamence.setmDefense(80);
        salamence.setmHeight("4 Ft, 11 In");
        salamence.setmHP(95);
        salamence.setmImageResource(R.mipmap.salamence);
        salamence.setmSpecialAttack(110);
        salamence.setmSpecialDefense(80);
        salamence.setmSpeed(100);
        salamence.setmWeight("226.2 lbs");
        mPokemon.add(salamence);


        Pokemon mewtwo = new Pokemon();
        mewtwo.setmName("Mewtwo");
        mewtwo.setmAttack(110);
        mewtwo.setmCategory("Psychic");
        mewtwo.setmDefense(90);
        mewtwo.setmHeight("6 Ft, 7 In");
        mewtwo.setmHP(106);
        mewtwo.setmImageResource(R.mipmap.mewtwo);
        mewtwo.setmSpecialAttack(154);
        mewtwo.setmSpecialDefense(90);
        mewtwo.setmSpeed(130);
        mewtwo.setmWeight("269.0 lbs");
        mPokemon.add(mewtwo);

        Pokemon charizard = new Pokemon();
        charizard.setmName("Charizard");
        charizard.setmAttack(84);
        charizard.setmCategory("Fire / Flying");
        charizard.setmDefense(78);
        charizard.setmHeight("5 Ft, 7 In");
        charizard.setmHP(78);
        charizard.setmImageResource(R.mipmap.charizard);
        charizard.setmSpecialAttack(109);
        charizard.setmSpecialDefense(85);
        charizard.setmSpeed(100);
        charizard.setmWeight("199.5 lbs");
        mPokemon.add(charizard);

        Pokemon blaziken = new Pokemon();
        blaziken.setmName("Blaziken");
        blaziken.setmAttack(120);
        blaziken.setmCategory("Fire / Fighting");
        blaziken.setmDefense(70);
        blaziken.setmHeight("6 Ft, 3 In");
        blaziken.setmHP(80);
        blaziken.setmImageResource(R.mipmap.blaziken);
        blaziken.setmSpecialAttack(110);
        blaziken.setmSpecialDefense(70);
        blaziken.setmSpeed(80);
        blaziken.setmWeight("114.6 lbs");
        mPokemon.add(blaziken);

        Pokemon rayquaza = new Pokemon();
        rayquaza.setmName("Rayquaza");
        rayquaza.setmAttack(150);
        rayquaza.setmCategory("Dragon / Flying");
        rayquaza.setmDefense(90);
        rayquaza.setmHeight("23 Ft, 0 In");
        rayquaza.setmHP(105);
        rayquaza.setmImageResource(R.mipmap.rayquaza);
        rayquaza.setmSpecialAttack(150);
        rayquaza.setmSpecialDefense(90);
        rayquaza.setmSpeed(95);
        rayquaza.setmWeight("455.2 lbs");
        mPokemon.add(rayquaza);

        Pokemon dialga = new Pokemon();
        dialga.setmName("Dialga");
        dialga.setmAttack(120);
        dialga.setmCategory("Steel / Dragon");
        dialga.setmDefense(120);
        dialga.setmHeight("17 Ft, 9 In");
        dialga.setmHP(100);
        dialga.setmImageResource(R.mipmap.dialga);
        dialga.setmSpecialAttack(150);
        dialga.setmSpecialDefense(100);
        dialga.setmSpeed(90);
        dialga.setmWeight("1505.8 lbs");
        mPokemon.add(dialga);

        Pokemon sceptile = new Pokemon();
        sceptile.setmName("Sceptile");
        sceptile.setmAttack(85);
        sceptile.setmCategory("Grass");
        sceptile.setmDefense(65);
        sceptile.setmHeight("5 Ft, 7 In");
        sceptile.setmHP(70);
        sceptile.setmImageResource(R.mipmap.sceptile);
        sceptile.setmSpecialAttack(105);
        sceptile.setmSpecialDefense(85);
        sceptile.setmSpeed(120);
        sceptile.setmWeight("115.1 lbs");
        mPokemon.add(sceptile);

        Pokemon empoleon = new Pokemon();
        empoleon.setmName("Empoleon");
        empoleon.setmAttack(86);
        empoleon.setmCategory("Water / Steel");
        empoleon.setmDefense(88);
        empoleon.setmHeight("5 Ft, 7 In");
        empoleon.setmHP(84);
        empoleon.setmImageResource(R.mipmap.empoleon);
        empoleon.setmSpecialAttack(111);
        empoleon.setmSpecialDefense(101);
        empoleon.setmSpeed(60);
        empoleon.setmWeight("186.3 lbs");
        mPokemon.add(empoleon);

        Pokemon flygon = new Pokemon();
        flygon.setmName("Flygon");
        flygon.setmAttack(100);
        flygon.setmCategory("Ground / Dragon");
        flygon.setmDefense(80);
        flygon.setmHeight("6 Ft, 7 In");
        flygon.setmHP(80);
        flygon.setmImageResource(R.mipmap.flygon);
        flygon.setmSpecialAttack(80);
        flygon.setmSpecialDefense(80);
        flygon.setmSpeed(100);
        flygon.setmWeight("180.8 lbs");
        mPokemon.add(flygon);







    }

    public List<Pokemon> getPokemon() {
        return mPokemon;
    }
    public Pokemon getPokemon(UUID id) {
        for (Pokemon pokemon : mPokemon) {
            if (pokemon.getmId().equals(id)) {
                return pokemon;
            }
        }
        return null;
    }
}

