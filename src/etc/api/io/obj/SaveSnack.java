package etc.api.io.obj;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SaveSnack {
    public static void main(String[] args) {

        List<snack> snackList = new ArrayList<>();
        Collections.addAll(snackList,
                new snack("콘칩", 1970, 1500, "좋음"),
                new snack("사브레", 1980, 2500, "좋음인가?"),
                new snack("오징어칩", 1990, 1800, "보통"));

        try(FileOutputStream fos = new FileOutputStream("C:/workspace/snack.sav")){

            // 객체를 저장할 수 있는 보조 스트림
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snackList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
