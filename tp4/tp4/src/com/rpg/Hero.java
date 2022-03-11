package com.rpg;

import java.util.*;
// Attributs à passer en "protected"
public abstract class Hero {
    private int lifePoints=150;
    private int armor;
    private int weaponDamage;
    private List <Potion> potions;
    private List<Food>lembas;
    //Getters/setters
    public void setLifePoints (int lifePoints){this.lifePoints =lifePoints;}
    public int getLifePoints() {return this.lifePoints;}
    abstract public void attack();
    abstract public void defend();
    abstract public void useConsumable(Consumable consumable);

    public setDamages(int damages){
        this.lifePoints = damages;
    }

}
