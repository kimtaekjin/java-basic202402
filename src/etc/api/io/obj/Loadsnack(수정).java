//package etc.api.io.obj;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.util.List;
//
//public class Loadsnack {
//    public static void main(String[] args) {
//
//        try(FileInputStream fis=new FileInputStream("C:/workspace/snack.sav")){
//
//
//
//            //객체를 불러올 보조스트림
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            List<snack> snackList  = (List<snack>) ois.readObject();
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
