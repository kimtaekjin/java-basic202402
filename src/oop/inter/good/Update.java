package oop.inter.good;

public class Update implements IuserSevice {
    public Update() {
        System.out.println("회원 정보 업데이트 중");
    }


    @Override
    public void execute() {
        System.out.println("수정 정보 저장 완료");
    }
}
