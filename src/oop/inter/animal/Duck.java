package oop.inter.animal;

public class Duck extends  Livings{
    @Override
    public void feed(String foodName) {
        System.out.println("오리가"+foodName+"을 먹습니다.");
    }

    @Override
    public boolean sleep() {
        return false;
    }
}
