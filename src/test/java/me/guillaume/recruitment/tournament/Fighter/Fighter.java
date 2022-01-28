package me.guillaume.recruitment.tournament.Fighter;

import me.guillaume.recruitment.tournament.Item.Buckler;
import me.guillaume.recruitment.tournament.Item.Item;

import java.util.ArrayList;
import java.util.List;

public abstract class Fighter {

    protected int hitPoints;
    protected int damages;
    protected List<Item> items = new ArrayList<Item>();
    protected EnumFighterWeapons weapon;
    protected int turnCount = 0;


    public Fighter(){
        this(100, 5);
    }

    public Fighter(int hitPoints, int damages){
        this.hitPoints = hitPoints;
        this.damages = damages;
    }


    public void engage(Fighter enemy){
        enemy.takeDamage(this, this.damages);
    }


    public void takeDamage(Fighter from, int value){
        int damageRecieve = value;
        for (Item item : this.items){
            damageRecieve = item.damageMultiplier(damageRecieve, from.getWeapon());
        }
        this.hitPoints = Math.max(0, this.hitPoints - damageRecieve);

        if (this.isAlive()){
            this.incrementTurn();
            from.takeDamage(this, this.getDamage());
        }

    }

    public int hitPoints(){
        return this.hitPoints;
    }

    public boolean isAlive(){
        return this.hitPoints > 0;
    }

    public Fighter equip(String objectName){
        Item item = null;

        switch (objectName){
            case "buckler":
                item = new Buckler();
                break;

            default:
                System.err.println("Could not equip the fighter with item named : " + objectName);
        }

        if (item != null){
            this.items.add(item);
        }
        return this;
    }


    public int getDamage(){
        int res = this.damages;
        for (Item item : this.items) {
            res = item.attackMultiplier(res);
        }
        return res;
    }


    public void incrementTurn(){
        this.turnCount++;
        for (Item item : this.items){
            item.incrementTurn();
        }
    }


    public EnumFighterWeapons getWeapon(){
        return this.weapon;
    }

}
