package com.rpg;
import com.utils.InputParser;

import java.util.Arrays;

public class Game {
    protected Hero[] heroes;
    protected int playerTurn;
    protected InputParser inputParser;

    public void playGame() {
        int numberOfHeroes = selectNumberOfHeroes();
        createHeroes(numberOfHeroes);

        generateCombat();
    }

    private boolean isAPlayerAlive() {
        for (Hero hero : heroes) {
            if (hero.getLifePoints() > 0) {
                return true;
            }
        }

        return false;
    }

    private int selectNumberOfHeroes() {
        return InputParser.questionWithIntOutput("Combien de héros vont tenter l'aventure ? ");
    }

    private int[] generateEntityTurnOrder() {
        int[] entityTurnOrder = new int[heroes.length + 1];

        // Generate ordered list for turns
        for (int i = 0; i < entityTurnOrder.length; i++) {
            entityTurnOrder[i] = i;
        }

        return entityTurnOrder;
    }


    private void attack(Enemy target, int weaponDamage) {
        target.setLifePoints(target.getLifePoints() - weaponDamage);

        int targetLifePoints = target.getLifePoints();
        String enemyStatus =  targetLifePoints > 0 ? String.format("L'ennemi a %d PV", target.getLifePoints()) : "L'ennemi est mort";
        System.out.println(enemyStatus);
    }

    private void heal(int lifePoints) {
        for (Hero hero : heroes) {
            hero.setLifePoints(hero.getLifePoints() + lifePoints);
        }
    }
}
