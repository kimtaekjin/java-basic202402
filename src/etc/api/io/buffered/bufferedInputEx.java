package etc.api.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class bufferedInputEx {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("C:/workspace/bout.txt");
            BufferedInputStream bis= new BufferedInputStream(fis)){

            long start = System.currentTimeMillis();

            int data;
            while((data=bis.read())!=-1) {

                System.out.println("char: " + (char) data);

            }
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
