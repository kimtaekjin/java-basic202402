package oop.inter.bed;

import static util.utility.input;

public class Main {
    public static void main(String[] args) {

        System.out.println("진행하실 번호를 입력하세요,");
        System.out.println("1. 가입 2. 로그인 3. 정보수정 4.탈퇴");
        String menu =input(">");
  // ********************input*************
        if(menu.equals("1")){
            join join=new join();
            join.join();
        }else if(menu.equals("2")){
            login log = new login();
            log.login();
        } else if (menu.equals("3")) {
            Update update = new Update();
            update.Update();
        }else if(menu.equals("4")){
            delete del= new delete();
            del.delete();
        }


    }
}
