package oop.this_super;

import oop.this_super.Player;

public class mage extends Player {
    int mana;

    mage(String name){
        super(name);
        this.mana=100;
    }

    void characterInfo(){

        super.characterInfo();
        System.out.println("#마나: "+mana);
    }

}
