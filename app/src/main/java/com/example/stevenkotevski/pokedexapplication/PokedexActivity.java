package com.example.stevenkotevski.pokedexapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

public class PokedexActivity extends SingleFragmentActivity {
    public static final String EXTRA_POKEMON_ID =
            "com.example.stevenkotevski.pokedexapplication";
    public static Intent newIntent(Context packageContext, UUID crimeId) {
        Intent intent = new Intent(packageContext, PokedexActivity.class);
        intent.putExtra(EXTRA_POKEMON_ID, crimeId);
        return intent;
    }



    @Override
    protected Fragment createFragment() {
        return new PokemonFragment();
    }
}



/*
public class PokedexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
}*/
