package me.guillaume.recruitment.tournament.Fighter;

public class Viking extends Fighter{

    protected EnumFighterWeapons weapon = EnumFighterWeapons.AXE;

    public Viking(){
        super(120, 6);
    }


    @Override
    public Viking equip(String objectName) {
        super.equip(objectName);
        return this;
    }


    @Override
    public EnumFighterWeapons getWeapon() {
        return this.weapon;
    }
}
