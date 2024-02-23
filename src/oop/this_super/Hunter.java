package oop.this_super;

import oop.this_super.Player;

public class Hunter extends Player {

    String pet;


    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("#펫: "+pet);
    }
}
