package etc.exception.custom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserLogin user= new UserLogin("abc1234","aaa1111!");


        System.out.print("id" );
        String id=sc.next();
        System.out.print("pw: ");
        String pw=sc.next();



    }
}
