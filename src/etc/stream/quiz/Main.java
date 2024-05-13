package etc.stream.quiz;

import util.Utility;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import static java.util.Comparator.*;
import static util.Utility.*;

public class Main {


    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );
        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        transactions.stream()
                .filter(trs -> trs.getYear()==2021)
                .sorted(comparing(Transaction::getValue))
                        .collect(Collectors.toList())
                                .forEach(System.out::println);

        makeLine();



        // 연습 2: 거래자가 근무하는 모든 도시 이름을 중복 없이 나열하시오.
        transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("transactions = " + transactions);


makeLine();
        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자 리스트로 이름순으로 오름차 정렬.

        transactions.stream()
                .map(Transaction::getTrader)
                .filter(td-> td.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

        transactions.forEach(System.out::println);
makeLine();
        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차 정렬하여 반환
        List<String> collect = transactions.stream()
                .map(trs -> trs.getTrader().getName())
                .distinct()
//                .sorted()
                .collect(Collectors.toList());


        Collections.sort(collect); //정렬
        System.out.println("collect = " + collect);


        makeLine();
        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean flag = transactions.stream()
                //equalsIgnoreCase ->대소문자 상관안하고 일치하는 단어를 가져온다.
                .anyMatch(trs -> trs.getTrader().getCity().equalsIgnoreCase("milan"));
        System.out.println("any people lived in Milan? " + flag);


        makeLine();
        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
//        List<Integer> list = transactions.stream()
//                .filter(trs -> trs.getTrader().getCity().equals("Cambridge"))
//                .map(Transaction::getValue)//메서드 참조식
//                //      .map(tr -> tr.getValue()) //람다식
//                .collect(Collectors.toList());
//        int total=0;
//        for (Integer i : list) {
//            total+=i;
//        }
//        System.out.println("total = " + total);

        int totalValue = transactions.stream()
                .filter(trs -> trs.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .mapToInt(tr -> tr.getValue())
                .sum();
        System.out.println("totalValue = " + totalValue);

makeLine();
        // 연습 7: 모든 거래에서 최고 거래액은 얼마인가?
        int maxint = transactions.stream()
                .mapToInt(Transaction::getValue)
                        .max()
                                .getAsInt(); //int값으로 mapping을 진행

        System.out.println("maxint = " + maxint);

        makeLine();
        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        transactions.stream()
                .min(comparing(Transaction::getValue))
                .ifPresent(System.out::println);

    }
}
