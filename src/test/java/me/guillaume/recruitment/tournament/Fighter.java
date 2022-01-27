package me.guillaume.recruitment.tournament;

public interface Fighter {

    /**
     * Start a fight with another enemy Fighter.
     * @param enemy The enemy to engage
     */
    public default void engage(Fighter enemy){
        enemy.takeDamage(this, this.getDamages());
    }

    /**
     * Deals damage to the fighter
     * @param from the enemy Fighter that has attaked the Fighter
     * @param value how much damages the enemy deals.
     */
    public void takeDamage(Fighter from, int value);

    /**
     * How many damages the Fighter has taken
     * @return
     */
    public int hitPoints();

    /**
     *
     * @param object the name of the object that will be given to the fighter
     * @return
     */
    public Fighter equip(String object);

    /**
     *
     * @return True if the fighter is still alive, False otherwise.
     */
    public default boolean isAlive(){
        return this.hitPoints() > 0;
    }

    /**
     *
     * @return How much damage the fighter deals.
     */
    public int getDamages();

}