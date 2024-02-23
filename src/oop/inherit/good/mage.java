package oop.inherit.good;

public class mage extends Player{
    int mana;


    void characterInfo(){

        super.characterInfo();
        System.out.println("#마나: "+mana);
    }

}
