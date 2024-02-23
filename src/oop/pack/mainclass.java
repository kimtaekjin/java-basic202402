package oop.pack;


//작성중인 패키지와 다른 곳에 위치한 클래스 정보를 불러오려면 import가 필요합니다.
//import oop.pack.fruits.apple;
//import oop.pack.fruits.banana;
//import oop.pack.fruits.melon;

//fruits 패키지의 모든 클래스를 inport 하는 방법
import oop.pack.fruits.*;
import oop.pack.fruits.apple;
import  oop.pack.juice.*;
public class mainclass {


    public static void main(String[] args) {


        //다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
        //반드시 패키지 경로를 직접 명시해 주셔야 합니다.
        apple a= new apple();
       oop.pack.juice.apple a2= new oop.pack.juice.apple();


       banana b= new banana();
        melon m = new melon();


    }
}
