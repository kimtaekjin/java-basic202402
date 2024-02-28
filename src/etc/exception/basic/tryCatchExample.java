package etc.exception.basic;

import oop.inter.bed.Main;

import java.util.Scanner;

public class tryCatchExample {
    public static void main(String[] args) {

        /*
         # 예외 처리
         - 개발자가 코드를 통해 처리할 수 있는 에러를 다루는 것.
         - 예외 처리는 시스템 스스로 오류를 복구하는 것이 아니고
          오류 발생 가능성이 있는 부분에 대한 처리를 미리 준비하는 것입니다.
         - 시스템의 비정상적 종료를 막고 코드의 흐름이 계속될 수 있도록
          사전에 준비하는 행위를 말합니다.
         */
        Scanner sc= new Scanner(System.in);

        try {


            System.out.println("정수1: ");
            int i=sc.nextInt();
            System.out.println("정수2: ");
            int j=sc.nextInt();

            System.out.println("나눗셈 시작!");



            //try 블록에는 예외 발생 가능성이 있는 코드를 배치합니다.
            System.out.printf("%d/%d = %d\n",i,j,i/j);
        } catch (Exception e) {
            //catch 블록에는 try블록에서 실제 예외가 발생했을 경우
            //실행할 코드를 작성합니다.
            System.out.println("0은 나눌 수 없는 숫자입니다.");

        }

        System.out.println("프로그램 정상 종료");

        sc.close();


    }
}
