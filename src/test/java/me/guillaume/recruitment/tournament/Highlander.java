package me.guillaume.recruitment.tournament;

public class Highlander implements Fighter{

    private int hitPoints = 0;


    public Highlander(){

    }

    public Highlander(String level){

    }



    @Override
    public void takeDamage(Fighter from, int value) {

    }

    @Override
    public int hitPoints() {
        return 0;
    }

    @Override
    public Fighter equip(String object) {
        return null;
    }


    @Override
    public int getDamages() {
        return 0;
    }

}
