package oop.this_super;

public class mainClass {

    public static void main(String[] args) {
        Player p1 = new Player();
        p1.characterInfo();
        System.out.println("====================");
        Player p2= new Player("플레이어2");
        p2.characterInfo();

        System.out.println("main에서 p2의 주소값: "+p2);
    }
}
