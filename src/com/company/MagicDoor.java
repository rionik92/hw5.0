package com.company;

public class MagicDoor {

    public Hero[] generateHeroes(){
        Hero[] herArr = new Hero[4];
        Hero h1 = new Hero( 300,50,1);
        herArr[1]=h1;
        Hero h2 = new Hero( 250,30,2);
        herArr[2]=h2;
        Hero h3 = new Hero( 200,25,3);
        herArr[3]=h3;
        Hero h4 = new Hero( 270,40,4);
        herArr[4]=h4;
        return herArr;
    }

}
