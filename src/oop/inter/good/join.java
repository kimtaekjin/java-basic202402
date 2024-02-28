package oop.inter.good;

public class join implements  IuserSevice{

    public join() {
        System.out.println("회원 가입 요청");
    }



    @Override
    public void execute() {
        System.out.println("회원 가입 로직 실행");
        System.out.println("DB접속 , 값을 불러오고 있습니다.");
    }
}
