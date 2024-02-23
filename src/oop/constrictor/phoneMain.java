package oop.constrictor;

public class phoneMain {
    public static void main(String[] args) {
        phone basic = new phone(); //생성자
    basic.showSpec();

        System.out.println("-----------------------------");

        phone galaxy = new phone("갤럭시 s24");
        galaxy.showSpec();


        System.out.println("----------------------------");
        phone iphone = new phone("아이폰 15","스페이스 그레이");
        iphone.showSpec();
    }
}
