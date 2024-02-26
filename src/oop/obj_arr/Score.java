package oop.obj_arr;


public class Score {
        /*
     - 이름, 국어, 영어, 수학, 총점, 평균(double)을
      담을 수 있는 객체를 디자인하세요.

     - 학생의 모든 정보를 한 눈에 확인할 수 있게
      scoreInfo() 메서드를 선언해 주세요.
      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.

     - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */

    String name;
    int lang;
    int English;
    int Math;

    Score(String name, int lang,int English,int Math) {
        this.name=name;
        this.lang=lang;
        this.English=English;
        this.Math=Math;
    }
    void ScoreInfo(){
       int all=lang+English+Math;
       double avg=all/3.0;
        System.out.printf("이름: %s, 국어: %d, 영어: %d , 수학: %d\n",name,lang,English,Math);
        System.out.printf("총점: %d, 평균: %.2f\n",all,avg);
        System.out.println("--------------------------------------------");

    }







}
