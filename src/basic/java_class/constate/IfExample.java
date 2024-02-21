package basic.java_class.constate;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("키를 입력하세요(cm): ");
        int height=sc.nextInt();

        if(height>=140){
            System.out.println("놀이기구 탑승 가능한 키 입니다.");
            System.out.println("나이를 입력해 주세요: ");
            int age=sc.nextInt();
            if(age>=8){
                System.out.println("놀이기구 탑승이 가능합니다.");
            }else if(age>=6){
                System.out.println("보호자 동반 시 탑승이 가능합니다.");
            }else{
                System.out.println("6세 미만은 탑승 불가합니다.");
            }
        }else{
            System.out.println("키가 140cm미만입니다.");
            System.out.println("놀이기구 탑승 불가입니다.");
        }

            //변수는 선언된 블록 내에서만 유효합니다.   *age //지역변수
            //if문 밖에서 age를 호출하려고 해도 호출되지가 않는다.


        sc.close();


    }
}
