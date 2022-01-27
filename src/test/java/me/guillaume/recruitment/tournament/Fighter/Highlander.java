package me.guillaume.recruitment.tournament.Fighter;

public class Highlander extends Fighter{

    public Highlander(){
        super(150, 12);
    }

    public Highlander(String level){
        this();
    }


    @Override
    public Highlander equip(String objectName) {
        return this;
    }
}
