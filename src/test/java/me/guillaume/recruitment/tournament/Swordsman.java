package me.guillaume.recruitment.tournament;

public class Swordsman implements Fighter {

    private int hitPoints = 100;

    public Swordsman() {
    }

    public Swordsman(String name) {
    }

    public Swordsman Swordsman(){
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
    public Swordsman equip(String object) {
        return this;
    }


    @Override
    public int getDamages() {
        return 5;
    }

}
