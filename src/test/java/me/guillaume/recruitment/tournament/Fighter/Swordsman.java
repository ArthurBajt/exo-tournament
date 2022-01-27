package me.guillaume.recruitment.tournament.Fighter;

import me.guillaume.recruitment.tournament.Fighter.Fighter;

public class Swordsman extends Fighter {


    public Swordsman(){
        super(100, 5);
    }

    public Swordsman(String name){
        this();
    }


    @Override
    public Swordsman equip(String objectName) {
        return this;
    }
}
