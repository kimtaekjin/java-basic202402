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

    private String name;
    private int lang;
    private int English;
    private int Math;
    private int total;
    private double avg;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLang() {
        return lang;
    }

    public void setLang(int lang) {
        this.lang = lang;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getTotal() {
        return total;
    }
    /*
    public void setTotal( ) {
        //이미 lang,english,Math가 세팅이 완료되었다고 가정.
        this.total = this.lang+this.English+this.Math;
    }
    */


    public Score(String name, int lang, int english, int math) {
        this.name = name;
        this.lang = lang;
        English = english;
        Math = math;
        setTotalAndAvg();
    }


    public double getAvg() {
        return avg;
    }
/*
    public void setAvg() {
        this.avg = this.total/3.0;
    }
*/

    //총점과 평균을 한번에 계산해서 세팅하는 메서드
    public void setTotalAndAvg(){
        this.total = this.lang+this.English+this.Math;
        this.avg = this.total/3.0;
    }


 public  void scoreInfo(){
     System.out.printf("이름: %s, 국어: %d, 영어: %d , 수학: %d\n",name,lang,English,Math);
     System.out.printf("총점: %d, 평균: %.2f\n",total,avg);
     System.out.println("--------------------------------------------");
 }

 //점수 유효성 검증

    public static boolean isValidateScore(int score) {
        if (score > 100 || score < 0) {
            System.out.println("유효하지 않은 점수입니다.");
            return false;
        }
        return true;
    }
}
