package oop.poly.player;

import oop.constrictor.Bread;

public class mage extends Player {
    int mana;

    mage(String name){
        super(name);
        this.mana=100;
    }
    public  void  blizzard(Player[] target){
        System.out.println(this.name+"님의 눈보라 시전!");
        this.mana-=30;
        if(this.mana<0){
            System.out.println("마나가 부족합니다.");
            return;
        }
        System.out.println("30의 마나가 소모됩니다. 남은 정신력: "+this.mana);
        System.out.println("---------------------");
        int idx=0;
        for (Player m1 : target) {

            if(m1==this){
                continue;
            }
            int blizzard= (int) (Math.floor(Math.random()*6)+10);
            m1.hp-=blizzard;
            System.out.printf("%s 님이 %s의 피해를 입었습니다. (남은체력: %d) %d\n",this.name,m1.name,blizzard,m1.hp);
            idx++;
        }
    }

    @Override
    void characterInfo(){

        super.characterInfo();
        System.out.println("#마나: "+mana);
    }

}
