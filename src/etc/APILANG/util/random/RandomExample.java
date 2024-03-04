package etc.APILANG.util.random;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        Random r= new Random();

        //실수 난수: 0.0<=~<1.0
        double d=r.nextDouble();
        System.out.println("d = " + d);

        //정수 난수: nextInt();
        int i = r.nextInt();// 기본범위:int의 전범위(-21억~ 약21억)
        System.out.println("i = " + i);

        //0~5까지의 정수 난수 생성 (끝 값이 미만으로 인식됨)
        int j = r.nextInt(6);
        System.out.println("j = " + j);


        //10~100까지의 정수 난수 생성
        int i1 = r.nextInt(91) + 10;
        System.out.println("i1 = " + i1);


        boolean b = r.nextBoolean();
        System.out.println("b = " + b);


    }
}
