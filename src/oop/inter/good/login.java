package oop.inter.good;

public class login implements  IuserSevice{
    public login() {
        System.out.println("login 요청");
    }


    @Override
    public void execute() {
        System.out.println("로그인 중...");
    }
}
