package me.guillaume.recruitment.tournament.Fighter;

import me.guillaume.recruitment.tournament.Item.Armor;
import me.guillaume.recruitment.tournament.Item.Buckler;
import me.guillaume.recruitment.tournament.Item.Item;

import java.util.ArrayList;
import java.util.List;

public abstract class Fighter {

    protected int hitPoints;
    protected int damages;
    protected List<Item> items = new ArrayList<Item>();
    protected EnumFighterWeapons weapon;
    protected int turnCount = -1;


    public Fighter(){
        this(100, 5);
    }

    public Fighter(int hitPoints, int damages){
        this.hitPoints = hitPoints;
        this.damages = damages;
    }


    public void engage(Fighter enemy){
        this.incrementTurn();
        enemy.takeDamage(this, this.getDamage());
    }


    public void takeDamage(Fighter from, int value){
        this.incrementTurn();
        int damageRecieve = value;
        for (Item item : this.items){
            damageRecieve = item.damageMultiplier(damageRecieve, from.getWeapon());
        }
        this.hitPoints = Math.max(0, this.hitPoints - damageRecieve);

        if (this.isAlive()){
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

            case "armor":
                item = new Armor();
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
        return Math.max(0, res);
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
