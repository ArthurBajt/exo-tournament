package me.guillaume.recruitment.tournament.Item;

import me.guillaume.recruitment.tournament.Fighter.EnumFighterWeapons;

public class Armor extends Item{


    public Armor(){}


    @Override
    public int damageMultiplier(int value, EnumFighterWeapons weapon) {
        return Math.max(0, value-3);
    }


    @Override
    public int attackMultiplier(int value) {
        return Math.max(0, value -1);
    }
}
