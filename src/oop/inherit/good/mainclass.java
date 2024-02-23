package oop.inherit.good;

public class mainclass {
    public static void main(String[] args) {
        warrior w1=new warrior();
        w1.name = "전사";
        w1.level = 1;
        w1.atk=3;
        w1.hp=50;
        w1.rage=20;
        w1.characterInfo();

        System.out.println("-----------------------");

        mage m1=new mage();
        m1.name ="마법사";
        m1.level = 1;
        m1.atk = 5;
        m1.hp=30;
        m1.mana=50;
        m1.characterInfo();

        System.out.println("-----------------------");

        Hunter h1=new Hunter();
        h1.name ="헌터";
        h1.level = 1;
        h1.hp=40;
        h1.atk = 4;
        h1.pet="고양이";
        h1.characterInfo();
    }
}
