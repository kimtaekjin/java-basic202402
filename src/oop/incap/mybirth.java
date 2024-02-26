package oop.incap;

import oop.incap.good.MyBirth;
/*
     - month와 day의 setter / getter 메서드를 선언하세요.
     - month: 1 ~ 12
     - day: 1 ~ 31
     - getter 메서드는 따로 비밀번호 등 권한 검사 없이
      바로 return 속성값 해 주세요.
     */

public class mybirth {

     private int year;
    private int month;
    private int day;


    void birthInfo(){
        System.out.printf("내 생일은 %d년 %d월 %d일입니다.",this.year,this.month,this.day);
    }

    public void setYear(int i) {
    }
}
    /*
     - 데이터와 데이터를 다루는 여러가지 메서드들을 하나로 묶는 이러한 행위들을
      캡슐화 라고 합니다. (encapsulation)
      데이터와 그 데이터를 다루는 로직을 하나로 묶어 쉽게 관리하고 유지 보수하기 위함 입니다.
     */