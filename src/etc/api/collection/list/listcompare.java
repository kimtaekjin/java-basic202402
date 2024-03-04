package etc.api.collection.list;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class listcompare {
    public static void main(String[] args) {

        /*
         ArrayList는 탐색 후 객체를 참조하는 경우에 유리하고,
         LinkedList는 잦은 삽입/삭제 등으로 리스트의 크기가 변할 때 유리.
         사이즈가 크지 않다면 크게 차이는 없습니다.
         */


        List<Integer> array=new ArrayList<>();
        List<Integer> linked=new ArrayList<>();

        for (int i = 0; i <1000000 ; i++) {
            array.add(i);
            linked.add(i);
        }

        long start,end;

        //배열리스트에서 데이터 제어
        start = System.currentTimeMillis();
        for (int i = 0; i < array.size(); i++) {
            array.remove(0);
        }
        end=System.currentTimeMillis();


        System.out.printf("배열리스트의 소요시간: %dms\n",end-start);

        System.out.println("------------------------------------------");

        start = System.currentTimeMillis();
        for (int i = 0; i < array.size(); i++) {
            linked.remove(0);
        }
        end=System.currentTimeMillis();


        System.out.printf("배열리스트의 소요시간: %dms\n",end-start);

        //%dms ->밀리초를 의미한다.

    }

}
