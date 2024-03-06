package etc.api.io.obj;


import java.io.Serializable;


//                                  ----중요---stream,snack
//객체를 스트림으로 전송하려면 직렬화가 가능해야 합니다.
//직렬화(serialize):자바 언어에서 사용되는 object 또는 Data를 다른 환경의 자바 프로그램에서도 사용 할 수 있도록
//byte 형태의 연속적인 데이터로 변환하는가술이다.
public class snack implements Serializable {


    private  String snackName;
    private int year;//출시연도
    private int price;//가격
    private String taste; //맛

    public snack(String snackName, int year, int price, String taste) {
        this.snackName = snackName;
        this.year = year;
        this.price = price;
        this.taste = taste;
    }


    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }


    @Override
    public String toString() {
        return "snack{" +
                "snackName='" + snackName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}
