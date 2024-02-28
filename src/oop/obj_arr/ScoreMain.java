package oop.obj_arr;

import java.util.Scanner;

import static oop.obj_arr.Score.isValidateScore;

public class ScoreMain {
    public static void main(String[] args) {

 /*
         - Score 객체를 담을 수 있는 배열을 선언하세요.
          배열의 크기는 넉넉하게 100개로 하겠습니다.

         - 반복문을 이용해서 사용자에게 이름, 국어, 영어, 수학점수를
         입력받은 후, 입력받은 점수를 토대로 Score 객체를 생성하세요.
         총점과 평균은 여러분들이 직접 구해서 넣으셔야 합니다.
         (직접 넣으시든, 메서드를 하나 만들어서 계산하시든 마음대로~)
         객체 생성 후, 미리 만들어 놓은 배열에 객체를 추가해 주세요.
         이름 입력란에 '그만' 이라고 입력하면 반복문을 종료시켜 주세요.

         - 반복문이 종료되었다면, 배열 내부에 있는 객체들을 순회하면서
          scoreInfo()를 모두 불러주세요. (반복문)
          주의!) 입력이 중간에 그만두어진다면, 배열의 나머지 인덱스는
          모두 null로 가득 차 있습니다. (null.scoreInfo() -> 에러)
         */

        Scanner sc=new Scanner(System.in);
        Score[] score=new Score[100];



        int idx=0;
            System.out.println("****학생 점수 입력 프로그램***");
            System.out.println("이름 입력 창에 '그만'을 입력할 시 즉시 종료됩니다.");
//        while(score[score.length-1]!=null){
            while (idx!=score.length){
            System.out.print("#이름: ");
            String name=sc.next();
            if(name.equals("그만")) {
                System.out.println("프로그램 종료");
                break;
            }


            System.out.println("#국어:");
            int lang =sc.nextInt();
            if(!isValidateScore(lang)){
                //유효성 검사
                continue;
            }
            System.out.println("#영어:");
            int English =sc.nextInt();
            if(!isValidateScore(English)){
                //유효성 검사
                continue;
            }
            System.out.println("#수학:");
            int Math =sc.nextInt();
            if(!isValidateScore(Math)){
                //유효성 검사
                continue;
            }



            Score sco= new Score(name,lang,English,Math);



//            int total = lang+English+Math;
//            double avg = total/3.0;
//            s.setTotal(total);
//            s.setAvg(avg);

            score[idx]=sco;
            idx++;

                System.out.println("***학생 정보 입력 완료 ***\n");
        }//입력 반복은 끝


        for (Score s : score) {
            if(s==null){
                break;
            }
            s.scoreInfo();
            System.out.println("-------------------------------");
        }
        sc.close();







//        for (int i = 0; i <score.length ; i++) {
//            System.out.println("이름을 입력해주세요: ");
//            System.out.println("'그만'을 입력할 시  종료됩니다.");
//            String name=sc.next();
//
//            if(name.equals("그만")){
//                break;
//            }
//
//            System.out.println("입력받은 이름: "+name);
//
//            System.out.println("국어 점수를 입력해주세요");
//            int lang=sc.nextInt();
//            System.out.println("입력받은 국어 점수: "+lang);
//
//            System.out.println("영어 점수를 입력해주세요");
//            int English=sc.nextInt();
//            System.out.println("입력받은 영어 점수: "+English);
//
//            System.out.println("수학 점수를 입력해주세요");
//            int Math=sc.nextInt();
//            System.out.println("입력받은 수학 점수: "+Math);
//
//            System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d\n",name,lang,English,Math);
//            System.out.println("---------------------------------");
//
//            Score newScore = new Score(name, lang, English, Math);
//            score[i] = newScore;
//        }



    }
}
