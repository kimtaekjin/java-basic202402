package basic.java_class.Loop;

import java.util.Scanner;

public class BreakExample {
    public BreakExample() {
    }

    public static void main(String[] args) {


        for(int i=1; i<11; i++){
            if(i>6)break;
            System.out.println(i+" ");
        }
        System.out.println("\n반복문 종료!");

        System.out.println("----------------------------------------------------------------");
        for(int i=1; i<11; i++){
            if(i==6)continue;
            System.out.println(i+" ");
        }
        System.out.println("\n반복문 종료!");


        System.out.println("------------------------------------------");

        Scanner sc=new Scanner(System.in);
        System.out.println("15 x 6 = ???");
        System.out.println("정답을 모르시면 0을 입력하면 종료됩니다.");
        while (true){
            System.out.print(">");
            int answer = sc.nextInt();

            if(answer==90){
                System.out.println("정답입니다.");
                break;
            }else if(answer==0){
                System.out.println("정답은 90이었습니다.");
                break;
            }else{
                System.out.println("틀렸습니다.");
                System.out.println("다시 입력해주세요.");
            }





        }














    }
}