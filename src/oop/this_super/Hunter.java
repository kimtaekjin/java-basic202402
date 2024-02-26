package oop.this_super;

import oop.this_super.Player;

public class Hunter extends Player {

    String pet;
    Hunter(String name){
        super(name);
        this.pet="아기 늑대";
    }


    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("#펫: "+pet);
    }
}
