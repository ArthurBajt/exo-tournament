package me.guillaume.recruitment.tournament.Item;

import me.guillaume.recruitment.tournament.Fighter.EnumFighterWeapons;

public class Buckler extends Item{

    private int axeBlowCount = 0;

    public Buckler(){}

    @Override
    public int damageMultiplier(int value, EnumFighterWeapons weapon) {
        if (((this.turnCount) % 2) == 0 && this.axeBlowCount < 3){
            if (weapon == EnumFighterWeapons.AXE){
                this.axeBlowCount += 1;
            }
            return 0;
        }
        return value;
    }
}
