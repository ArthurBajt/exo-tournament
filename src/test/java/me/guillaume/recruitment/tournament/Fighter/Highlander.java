package me.guillaume.recruitment.tournament.Fighter;

import me.guillaume.recruitment.tournament.Item.Item;

public class Highlander extends Fighter{

    public Highlander(){
        super(150, 12);
    }

    public Highlander(String level){
        this();
    }


    @Override
    public Highlander equip(String objectName) {
        super.equip(objectName);
        return this;
    }

    @Override
    public int getDamage() {
        int res = this.damages;
        if (this.turnCount % 3 == 2){
            res = 0;
        }

        for (Item item : this.items) {
            res = item.attackMultiplier(res);
        }
        return Math.max(0, res);
    }
}
