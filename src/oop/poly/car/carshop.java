package oop.poly.car;

public class carshop {
    /*
     - 키워드 instanceof는 객체가 지정한 클래스 타입을 가질 수 있는
      객체인지를 검사할 때 사용하는 연산자 입니다.

     - instanceof를 기준으로 좌항의 객체가 우항의 클래스 타입을 가질 수
      있는 지를 물어봐서 그렇다면 true, 그렇지 않다면 false를 도출합니다.
     */
    public void carprice(car c){
        if(c instanceof sonata) {
            System.out.println("소나타 3000만");
        } else if (c instanceof tesla) {
            System.out.println("테슬라 1억");
        }else if(c instanceof porsche){
            System.out.println("포르쉐 2억");
        }

    }

}
