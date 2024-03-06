package etc.api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutEx {
    public static void main(String[] args) {
        System.out.println("시작!");

        //dumy data
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < 10000000; i++) {
            text.append(i+"안녕하세요\n");
        }

        //Buffered가 붙은 객체들은 기존에 사용했던 객체를 생성자의 매개값으로 전달.
        // ex)BufferedOutputStream ->FileOutPutStream을 매개값으로 받아야한다.
        //bufferedinputstream -> fileinputstram을 매개값으로 받아야한다.


        long start = System.currentTimeMillis();
        try(FileOutputStream fos =new FileOutputStream("C:/workspace/bout.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos)){

            //더미 데이터를 stringbulider로 생성함.
            //새로운 string 객체 생성 -> 생성자의 매개값으로 stringbuilder를 전달
            //바이트 데이터로 변환
            String str=new String(text); //stringbuilder를 string으로 변환
            byte[] data = str.getBytes();
            bos.write(data);


        }catch (Exception e ){
            e.printStackTrace();
        }


        long end = System.currentTimeMillis();

        System.out.println("소요시간: "+(end-start)*0.001+"초");

    }
}
