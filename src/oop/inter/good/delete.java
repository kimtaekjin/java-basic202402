package oop.inter.good;

public class delete implements IuserSevice{
    public delete() {
        System.out.println("회원 탈퇴 요청");
    }

    @Override
    public void execute() {
        System.out.println("탈퇴 완료");
    }
}
