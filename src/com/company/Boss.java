package com.company;

import java.util.Random;

public class Boss {
    private int health;
    private int damage;
    private int typeDefence;



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getTypeDefence() {
        return typeDefence;
    }

    public void setTypeDefence(int typeDefence) {
        this.typeDefence = typeDefence;
    }
    public String printInfo() {
        return health + " " + damage + " " + typeDefence;
    }

    public  void changeBossDefence (){
        Random r = new Random();
        int randomNumber = r.nextInt(4) +1;
        typeDefence[0] = typeDefence[randomNumber];

    }

}

