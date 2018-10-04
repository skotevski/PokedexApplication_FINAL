package com.example.stevenkotevski.pokedexapplication;

import java.util.UUID;

public class Pokemon {
    private UUID mId;

    private String mName;
    private int mImageResource;
    private String mHeight;
    private String mWeight;
    private String mCategory;
    private int mHP;
    private int mAttack;
    private int mDefense;
    private int mSpecialAttack;
    private int mSpecialDefense;
    private int mSpeed;


    //private Date mDate;
    //private boolean mSolved;
    public Pokemon() {
        mId = UUID.randomUUID();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public String getmHeight() {
        return mHeight;
    }

    public void setmHeight(String mHeight) {
        this.mHeight = mHeight;
    }

    public String getmWeight() {
        return mWeight;
    }

    public void setmWeight(String mWeight) {
        this.mWeight = mWeight;
    }

    public String getmCategory() {
        return mCategory;
    }

    public void setmCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    public int getmHP() {
        return mHP;
    }

    public void setmHP(int mHP) {
        this.mHP = mHP;
    }

    public int getmAttack() {
        return mAttack;
    }

    public void setmAttack(int mAttack) {
        this.mAttack = mAttack;
    }

    public int getmDefense() {
        return mDefense;
    }

    public void setmDefense(int mDefense) {
        this.mDefense = mDefense;
    }

    public int getmSpecialAttack() {
        return mSpecialAttack;
    }

    public void setmSpecialAttack(int mSpecialAttack) {
        this.mSpecialAttack = mSpecialAttack;
    }

    public int getmSpecialDefense() {
        return mSpecialDefense;
    }

    public void setmSpecialDefense(int mSpecialDefense) {
        this.mSpecialDefense = mSpecialDefense;
    }

    public int getmSpeed() {
        return mSpeed;
    }

    public void setmSpeed(int mSpeed) {
        this.mSpeed = mSpeed;
    }
}
