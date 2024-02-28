package oop.abs;

public class cat extends pet{
    public cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takenap() {
        System.out.println("캣타워에 냥냥");
    }

    @Override
    public void walk() {
        System.out.println("산책싫다냥");
    }

    @Override
    public void eat() {
        System.out.println("생선 옴뇸뇸");
    }
}
