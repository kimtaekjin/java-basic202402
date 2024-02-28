package oop.static_.method;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

import static util.utility.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        count c=new count();
        int result2 =count.method2();

        makeLine();

        String name = input("이름을 입력하세요.");
        System.out.println("name = "+name);
    }


}
