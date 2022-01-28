package me.guillaume.recruitment.tournament.Fighter;

import me.guillaume.recruitment.tournament.Fighter.Fighter;

public class Swordsman extends Fighter {

    protected EnumFighterWeapons weapon = EnumFighterWeapons.ONE_HAND_SWORD;

    public Swordsman(){
        super(100, 5);
    }

    public Swordsman(String name){
        this();
    }


    @Override
    public Swordsman equip(String objectName) {
        super.equip(objectName);
        return this;
    }

    @Override
    public EnumFighterWeapons getWeapon() {
        return this.weapon;
    }
}
