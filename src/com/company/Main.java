package com.company;

public class Main {

    public static void main(String[] args) {

        Hero warrior = new Hero(300, 50, 1);
        Hero magical = new Hero(150, 50, 2);
        Hero mental = new Hero(200, 50, 3);
        Hero kinetic = new Hero(250, 50, 4);
        System.out.println(kinetic.printInfo());


        Boss b1 = new Boss();
        b1.setHealth(1000);
        b1.setDamage(200);
        b1.setTypeDefence(1);
        System.out.println(b1.printInfo());

    }

}
