package oop.poly.car;

import oop.incap.good.MyBirth;

public class Main {
    public static void main(String[] args) {

        sonata s1=new sonata();
        sonata s2=new sonata();
        sonata s3=new sonata();

        porsche p1= new porsche();
        porsche p2= new porsche();
        porsche p3= new porsche();

        tesla t1 = new tesla();
        tesla t2 = new tesla();
        tesla t3 = new tesla();
        tesla t4 = new tesla();
//        s1.run(); s2.run(); s3.run(); p1.run(); p2.run(); p3.run();
//        t1.run();t2.run();t3.run();t4.run();


//        sonata[] sonatas = {s1,s2,s3}; //배열은 같은 타입만 모아둘 수 있다. *sonata배열에 t1을 넣을 수 없다(x)
//        for (sonata s : sonatas) {
//            s.run();
//        }


        //다형성을 적용해서 서로 다른 타입들을 모아놓을 수 있다.
        car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4};
        //부모형 객체에는 서로 다른 자식타입이 전부 대입 가능하다.

        for (car c : cars) {
            c.run();
        }
        System.out.println("------------------");

        driver kim = new driver();
        kim.drive(s1);
        kim.drive(p2);
        kim.drive(t3);

        tesla mytesla = (tesla) kim.buyCar("테슬라");
        mytesla.run();
        mytesla.acriveautopilot();

        System.out.println("--------------------");
        carshop shop = new carshop();
        shop.carprice(s2);
        shop.carprice(t4);
        shop.carprice(p1);


    }


}
