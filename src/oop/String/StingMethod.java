package oop.String;

import com.sun.source.doctree.IndexTree;

import java.util.Arrays;

public class StingMethod {
    public static void main(String[] args) {


        //charAt(index) :문자열 인덱스에 따른 단일 문자를 반환
        String str ="hello java";

        char  c= str.charAt(4);
        System.out.println("4번 인덱스 =  " + c);


        //subString(begin,end): 문자열을 범위를 지정해서 부분 추출.
        String ss1 = str.substring(1,5); //1번 이상 5번 미만.
        System.out.println("ss1 = " + ss1);

         String ss2=str.substring(6);
        System.out.println("ss2 = " + ss2);


        //length():문자열의 총 길이 반환

        int len =str.length();
        System.out.println("len = " + len);

        //indexOf(str); 해당 문자가 있는 인덱스를 반환
        //해당 문자가 존재하지 않는다면 -1을 리턴
        int idx1 = str.indexOf("L"); //앞에서부터 탐색
        System.out.println("idx1 = " + idx1);



        int idx2 = str.lastIndexOf("l");//뒤에서부터 탐색
        System.out.println("idx2 = " + idx2);

        //여러 문자를 전달하면 시작 인덱스를 알려줍니다.
        int idx3 = str.indexOf("Java");
        System.out.println("idx3 = " + idx3);

        String str2 = "HeLLo WoRLd";
        String lowerCase = str2.toLowerCase();//일괄 소문자 변경
        System.out.println("lowerCase = " + lowerCase);
        String upper = str2.toUpperCase();//일괄 대문자 변경
        System.out.println("upper = " + upper);

        //trim(): 문자열의 앞, 뒤 공백을 제거.
        String name = "             홍길동                ";
        System.out.println(name +"님 안녕하세요.");
        System.out.println(name.trim() +"님 안녕하세요.");

        //replace(old,new):기존 문자열 내부의 old값을 모두 찾아서 new 문자열로 일괄 변경


        String java="자바는 재밌습니다. 자바 커피는 맛있습니다.";
        System.out.println(java.replace("자바","java"));
        System.out.println(java.replace("습니",""));


        //split(구분자): 문자열을 구분자로 구분하여 분할.
        //분할된 문자들은 string 배열에 담겨서 리턴.

        String phone = "010-1234-5678";
        String[] number = phone.split("-");
        System.out.println(Arrays.toString(number));

        String pet = "멍멍이, 야옹이, 쩩쩩이";
        String[] pets = pet.split(",");
        System.out.println(Arrays.toString(pets));

        System.out.println("------------------------------");

        //문자열의 정수/실수 변환
        String s1= "100";
        String s2= "3.14";
        System.out.println(s1+s2);

        //순수한 정수 or 실수로 이루어져 있어야 변환이 가능하다.
        int i = Integer.parseInt(s1);//문자열 ->정수
        double d = Double.parseDouble(s2); //문자열 ->실수
        System.out.println(i+d);


        //valueOf: 기본 타입을 문자열로 변경
        System.out.println(String.valueOf(i)+String.valueOf(d));

    }
}