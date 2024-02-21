package basic.java_class.constate;

import java.util.Scanner;

public class SwitchQuize_3 {
    public static void main(String[] args) {

    /*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.(+,-,*,/)
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
         만약,사용자가 나눗셈을 선택 했을 때 0으로 나누려는 시도를 한다면 연산할 수 없는
         입력값이라고 얘기 해 주세요.
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("정수를 입력해주시오.");
        int num1=sc.nextInt();

        System.out.println("연산자를 선택해주세요.(+,-,*,/");
        String a=sc.next();

        System.out.println("두 번째 정수를 입력해주세요.");
        int num2 =sc.nextInt();

        int result = 0;
        boolean flag =false;
        switch (a){

            case "+":
                System.out.printf("%d %s %d = %d\n",num1,a,num2,num1+num2);
                break;
                case "-":
                    result=num1-num2;
                System.out.println("결과값은: "+result);
                break;
                case "*":
                System.out.println("결과값은: "+(num1*num2));
                break;
                case "/":
                    if(num2==0){
                        System.out.println("연산할 수 없는 입력값 입니다,");
                        flag=true;
                        break;
                    }
                System.out.println("결과값은: "+(num1/num2));
                break;
            default:
                System.out.println("잘못입력하셨습니다.");
        }

        if(!flag){
            System.out.println("flag가 true일 때만 실행하게 만든다.(안내문)");
            //대충 결과문 암시 호출창
        }
        sc.close();

    }
}
