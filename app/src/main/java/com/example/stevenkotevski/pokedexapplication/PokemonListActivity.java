package com.example.stevenkotevski.pokedexapplication;

import android.support.v4.app.Fragment;

public class PokemonListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() { return new PokemonListFragment(); }
}
