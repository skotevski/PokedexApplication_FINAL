package com.example.stevenkotevski.pokedexapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.UUID;


public class PokemonFragment extends Fragment {
    private Pokemon mPokemon;
    private TextView mTitleField;
    private TextView mCategoryField;
    private TextView mAttackField;
    private TextView mDefenseField;
    private TextView mHPField;
    private TextView mHeightField;
    private TextView mSpecialAttackField;
    private TextView mSpecialDefenseField;
    private TextView mSpeedField;
    private TextView mWeightField;

    private ImageView mImageField;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //mPokemon = new Pokemon();

        UUID pokemonId = (UUID) getActivity().getIntent()
                .getSerializableExtra(PokedexActivity.EXTRA_POKEMON_ID);
        mPokemon = PokemonLab.get(getActivity()).getPokemon(pokemonId);



    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pokemon, container, false);

        mTitleField = (TextView)v.findViewById(R.id.pokemon_Name);
        mTitleField.setText(mPokemon.getmName().toString());

        mCategoryField = (TextView)v.findViewById(R.id.pokemon_Category);
        mCategoryField.setText("Category:  " + mPokemon.getmCategory());

        mAttackField = (TextView)v.findViewById(R.id.pokemon_Attack);
        mAttackField.setText  ("Attack:    " + mPokemon.getmAttack());

        mDefenseField = (TextView)v.findViewById(R.id.pokemon_Defense);
        mDefenseField.setText ("Defense:  " + mPokemon.getmDefense());

        mHPField = (TextView)v.findViewById(R.id.pokemon_HP);
        mHPField.setText ("HP:     " + mPokemon.getmHP());

        mHeightField = (TextView)v.findViewById(R.id.pokemon_Height);
        mHeightField.setText ("Height:     " + mPokemon.getmHeight());

        mSpecialAttackField = (TextView)v.findViewById(R.id.pokemon_SpecialAttack);
        mSpecialAttackField.setText ("Special Attack:    " + mPokemon.getmSpecialAttack());

        mSpecialDefenseField = (TextView)v.findViewById(R.id.pokemon_SpecialDefense);
        mSpecialDefenseField.setText ("Special Defense:    " + mPokemon.getmSpecialDefense());

        mSpeedField = (TextView)v.findViewById(R.id.pokemon_Speed);
        mSpeedField.setText ("Speed:    " + mPokemon.getmSpeed());

        mWeightField = (TextView)v.findViewById(R.id.pokemon_Weight);
        mWeightField.setText ("Weight:    " + mPokemon.getmWeight());


    mImageField = (ImageView)v.findViewById(R.id.pokemon_Image);
    mImageField.setImageResource(mPokemon.getmImageResource());










        return v;
    }
}
