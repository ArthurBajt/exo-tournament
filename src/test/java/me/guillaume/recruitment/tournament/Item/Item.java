package me.guillaume.recruitment.tournament.Item;

public abstract class Item {
    protected int turnCount = 0;


    public Item(){}


    public int damageMultiplier(int value){
        return value;
    }


    public int attackMultiplier(int value){
        return value;
    }


    public void incrementTurn(){
        this.turnCount++;
    }



}
