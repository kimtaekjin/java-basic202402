package etc.exception.throws_;

public class Mainclass {
    public static void main(String[] args) {




        person park =new person();
        try {
            person cloneperson = (person) park.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
