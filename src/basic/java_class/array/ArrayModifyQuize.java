package basic.java_class.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuize {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        String[] kakao = {"무지","네오","어피치","라이언","춘식이"};
        System.out.println("현재 저장된 친구들: "+ Arrays.toString(kakao));


        // 1. 수정 타겟의 이름을 입력받는다.
        // 2. 해당 이름이 있는지 탐색해본다.
        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.


        //문자열과 문자열의 비교  ->.equals를 사용한다. (동등비교)
        boolean flag=false;

        for(int i=0; i< kakao.length; i++){
            System.out.println("---------------------");
            System.out.println("수정할 친구의 이름을 입력해주세요!");
            System.out.println("수정을 더 이상 원치 않을 경우 '수정 완료'를 입력해주세요.");
            String name=sc.next();

            if(name.equals(kakao[i])){
                System.out.println("동일한 친구의 이름이 있습니다. 해당 인덱스: "+i);
                System.out.println("친구의 이름을 변경해 주세요!");
                String modify=sc.next();
                System.out.println("기존 친구의이름:"+kakao[i]+" 변경한 친구의 이름:"+modify);
                kakao[i]=modify;
                flag=true;
                break;
            }
            if(!flag){
                System.out.println("같은 이름의 친구가 존재하지 않습니다!!");
                break;
            }

        }
        System.out.println("----------------------------------------------");
        System.out.println("수정완료된 친구들의 이름");
        for(String f : kakao){
            if(f==null)break;
            System.out.print(f+" ");
        }

sc.close();
    }
}
