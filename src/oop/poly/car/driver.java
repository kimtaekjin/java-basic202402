package oop.poly.car;

public class driver {

    public void drive(car c) {
        System.out.println("운전 개시");
        c.run();
    }

    public car buyCar(String name) {
        if (name.equals("소나타")) {
            System.out.println("소나타를 구입합니다.");
            return new sonata();
        } else if (name.equals("포르쉐")) {
            System.out.println("포르쉐를 구입합니다.");
            return new porsche();
        } else if (name.equals("테슬라")) {
            System.out.println("테슬라를 구입합니다.");
            return new tesla();
        } else {
            System.out.println("해당하는 차량이 없습니다.");
            return null;
        }
    }
}
