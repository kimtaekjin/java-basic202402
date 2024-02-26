package oop.this_super;

public class mainClass {

    public static void main(String[] args) {
        Player p1 = new Player();
        p1.characterInfo();
        System.out.println("====================");
        Player p2= new Player("플레이어2");
        p2.characterInfo();
        Player p3 = new Player("masition");
        p3.characterInfo();

        System.out.println("main에서 p2의 주소값: "+p2);

        System.out.println("-------------------------------------");


        Player p4 = new Player("플레이어4",60);
        p4.characterInfo();
        p1.attack(p4);
        p2.attack(p4);
        p3.attack(p4);


        System.out.println("------------------------");

        warrior w1 = new warrior("warrior");
        w1.characterInfo();
        w1.attack(p2);

        System.out.println("------------------------");
        mage m1 = new mage("법사");
        m1.characterInfo();
        System.out.println("------------------------");
        Hunter h1= new Hunter("사냥꾼");
        h1.characterInfo();
    }
}
