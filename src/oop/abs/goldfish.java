package oop.abs;

public class goldfish extends pet{
    public goldfish(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takenap() {
        System.out.println("뻐끔뻐끔");
    }

    @Override
    public void eat() {
        System.out.println("사료 냠냠");
    }
}
