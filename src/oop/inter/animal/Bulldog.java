package oop.inter.animal;

public class Bulldog extends Livings implements violent,Huntable{


    @Override
    public void feed(String foodName) {
        System.out.println("불독이"+foodName+"을 씹어먹습니다.");
    }

    @Override
    public boolean sleep() {
        return false;
    }

    @Override
    public void angry() {
        System.out.println("불독이 화가 났습니다.");
    }

    @Override
    public void fight() {
        System.out.println("불독이 미쳐날뜁니다.");
    }

    @Override
    public void hunt(Animal animal) {
        System.out.println("불독이 사냥!");
    }
}
