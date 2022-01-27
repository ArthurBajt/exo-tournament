package me.guillaume.recruitment.tournament.Fighter;

public class Viking extends Fighter{

    public Viking(){
        super(120, 6);
    }


    @Override
    public Viking equip(String objectName) {
        return this;
    }
}
