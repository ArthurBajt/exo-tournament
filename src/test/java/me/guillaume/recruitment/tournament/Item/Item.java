package me.guillaume.recruitment.tournament.Item;

import me.guillaume.recruitment.tournament.Fighter.EnumFighterWeapons;

public abstract class Item {
    protected int turnCount = 0;


    public Item(){}


    public int damageMultiplier(int value, EnumFighterWeapons weapon){
        return value;
    }


    public int attackMultiplier(int value){
        return value;
    }


    public void incrementTurn(){
        this.turnCount += 1;
    }



}
