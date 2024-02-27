package oop.poly.player;

import oop.poly.player.Player;

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
