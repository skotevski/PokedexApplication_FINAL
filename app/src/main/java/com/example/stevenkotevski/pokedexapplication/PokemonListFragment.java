package com.example.stevenkotevski.pokedexapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class PokemonListFragment extends Fragment {

    private RecyclerView mPokemonRecyclerView;
    private PokemonAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pokemon_list, container, false);
        mPokemonRecyclerView = (RecyclerView) view.findViewById(R.id.pokemon_recycler_view);
        mPokemonRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void updateUI() {
        PokemonLab pokemonLab = PokemonLab.get(getActivity());
        List<Pokemon> pokemon = pokemonLab.getPokemon();
        mAdapter = new PokemonAdapter(pokemon);
        mPokemonRecyclerView.setAdapter(mAdapter);
    }

    private class PokemonHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private Pokemon mPokemon;

        private TextView mTitleTextView;
        //private TextView mAttackTextView;
       // private TextView mDateTextView;

        public PokemonHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_pokemon, parent, false));
            itemView.setOnClickListener(this);


            mTitleTextView = (TextView) itemView.findViewById(R.id.pokemon_title);
            //mAttackTextView = (TextView) itemView.findViewById(R.id.pokemon_Attack);
            //mDateTextView = (TextView) itemView.findViewById(R.id.crime_date);

        }

        public void bind(Pokemon pokemon) {
            mPokemon = pokemon;
            mTitleTextView.setText(mPokemon.getmName());
            //mAttackTextView.setText("" + mPokemon.getmAttack());
            //mDateTextView.setText(mCrime.getDate().toString());
        }

        @Override
        public void onClick(View view) {
//            Toast.makeText(getActivity(),
//                    mPokemon.getmName() + " clicked!", Toast.LENGTH_SHORT)
//                    .show();
            //Intent intent = new Intent(getActivity(), PokedexActivity.class);
            Intent intent = PokedexActivity.newIntent(getActivity(), mPokemon.getmId());
            startActivity(intent);
        }


    }

    private class PokemonAdapter extends RecyclerView.Adapter<PokemonHolder> {
        private List<Pokemon> mPokemon;
        public PokemonAdapter(List<Pokemon> pokemon) { mPokemon = pokemon; }


        @Override
        public PokemonHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new PokemonHolder(layoutInflater, parent);
        }
        @Override
        public void onBindViewHolder(PokemonHolder holder, int position) {

            Pokemon pokemon = mPokemon.get(position);
            holder.bind(pokemon);

        }
        @Override
        public int getItemCount() {
            return mPokemon.size();
        }

    }


}

