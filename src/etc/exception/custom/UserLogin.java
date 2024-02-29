package etc.exception.custom;

public class UserLogin {


    String userAccount;//계정명
    String userPassword;//가입 시 설정한 패스워드


    //객체 생성 시 id,pw를 한번에 세팅
    public UserLogin(String userAccount, String userPassword) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
    }


    //로그인 검증



}
