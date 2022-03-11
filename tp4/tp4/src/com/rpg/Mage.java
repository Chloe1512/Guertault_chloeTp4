package com.rpg;

public class Mage extends SpellCaster {
    public Mage() {
        this.manaPoints = 10;
        this.lifePoints = 10;
        this.armor = 10;
        this.weaponDamage = 10;
        this.potions = null;
        this.lembas = null;
    }

    @Override
    public int attack() {
        if (manaPoints == 0) {
            return 0;
        }
        // Launch arrow
        manaPoints--;
        return weaponDamage;
    }

    @Override
    public void defend() {

    }

    @Override
    public void useConsumable(Consumable consumable) {

    }
}
