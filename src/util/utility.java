package util;

import java.util.Scanner;
import java.util.Stack;

public class utility {

    //입력창의 구분을 위해 줄을 그어두는 메서드

    static Scanner sc= new Scanner(System.in);



    public  static void makeLine(){
        System.out.println("------------------------");
    }

    //문자열을 입력받는 기능
    public static  String input(String message){
        System.out.println(message);
        return  sc.nextLine();
    }

}
