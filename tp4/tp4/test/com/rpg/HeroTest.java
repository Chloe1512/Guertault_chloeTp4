package com.rpg;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class HeroTest {
    @Test
    public void testPV(){
        Hero hero = new Hunter();
        Enemy enemy = new Boss();
        int damages = enemy.attack();
        hero.setDamgages(damages);
        //validation du test
        assertTrue(hero.getLifePoints()<0);

    }
    @Test
    public void testFaux(){
        Hero hero = new Hunter();
        hero.setLifePoints(5);
        //validation du test
        assertTrue(hero.getLifePoints()<0);
    }
}
