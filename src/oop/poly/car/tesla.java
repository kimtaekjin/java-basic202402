package oop.poly.car;

public class tesla extends  car {
    @Override
    public void run() {
        System.out.println("테슬라가 달립니다.");
    }

    public void  acriveautopilot(){
        System.out.println("테슬라의 오토파일럿을 기동합니다,");
    }
}
