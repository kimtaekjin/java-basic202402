package oop.abs;

public class dog extends pet{


    public dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takenap() {
        System.out.println("강아지가 마당에서 잠");
    }

    @Override
    public void eat() {
        System.out.println("사료를 와구와구");
    }
}
