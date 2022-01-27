package me.guillaume.recruitment.tournament;

public class Viking implements Fighter{

    private int hitPoints = 120;


    public Viking(){

    }


    public Viking Viking(){
        return this;
    }


    @Override
    public void takeDamage(Fighter from, int value) {
        this.hitPoints = Math.max(0, this.hitPoints - value);
        if (this.isAlive()){
            from.takeDamage(this, this.getDamages());
        }
    }

    @Override
    public int hitPoints() {
        return this.hitPoints;
    }

    @Override
    public Viking equip(String object) {
        return this;
    }


    @Override
    public int getDamages() {
        return 6;
    }

}
