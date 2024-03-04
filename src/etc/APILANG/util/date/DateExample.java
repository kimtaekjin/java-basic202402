package etc.APILANG.util.date;

import javax.swing.text.Utilities;
import javax.xml.transform.Source;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class DateExample {

    public static void main(String[] args) {


        Date date = new Date();
        System.out.println(date);




        //현재 날짜 정보 얻기 (연,월 일)
        LocalDate now=LocalDate.now();
        System.out.println(now);


        //현재 시간 정보 얻기 (시,분,초)
        LocalTime nowTime=LocalTime.now();
        System.out.println(nowTime);

        //현재 날짜와 시간 정보 얻기( 연,월,일,시,분,초)
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);


        //특정 날짜와 시간 정보 얻기
        LocalDateTime beginDate = LocalDateTime.of(2022, 7, 1, 9, 0, 0);
        System.out.println(beginDate);


        //연 , 월 , 일 따로 추출

        int year= now1.getYear();
        System.out.println("year = " + year);

        //문자 형태의 월 리턴(Month라는 열거형 타입 중 하나)
        Month month=now.getMonth();
        System.out.println("month = " + month);

        //정수 형태의 월 리턴
        int monthValue = now1.getMonthValue();
        System.out.println("monthValue = " + monthValue);

        //일 추출
        int dayOfMonth = now1.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);

        //요일 (열거형 타입 리턴)
        DayOfWeek dayOfWeek = now1.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);


        System.out.println("---------------------------");

        //지금으로부터 3일 뒤

        LocalDateTime d2 = now1.plusDays(3);
        System.out.println("d2 = " + d2);

        //지금으로부터 1년 2개월 7일 뒤

        //메서드 체인닝 = 리턴된 객체를 연계해서 리턴한다.
        LocalDateTime d3 = now1.plusYears(1)
                            .plusMonths(2)
                            .plusDays(7);
        System.out.println("d3 = " + d3);


        //지금으로부터 9개월 3일 전

        LocalDateTime d4 = now1.minusMonths(9).minusDays(23);
        System.out.println("d4 = " + d4);

        //사이 날짜 연산

        LocalDate b = LocalDate.of(2020, 12, 30);
        LocalDate f = LocalDate.of(2022, 9, 14);

        long between = ChronoUnit.YEARS.between(b, f);
        System.out.println("between = " + between);


        System.out.println("-----------------------------------");


        //날짜 포맷 변경하기
        System.out.println(now1);

        //DateTimeFormatter 객체 생성 ->원하시는 날짜 형태를 서식문자로 표현
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");

       //준비한 DateTimeFormatter 객체를 format() 매개값을 전달.
        System.out.println(now1.format(dtf));





    }
}
