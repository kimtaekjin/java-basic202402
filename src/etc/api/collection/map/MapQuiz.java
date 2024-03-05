package etc.api.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import static util.Utility.makeLine;

public class MapQuiz {
    public static void main(String[] args) {
/*
         1. engKor이라는 이름으로 Map을 생성해 주세요.
          이 Map은 key로 영단어, value로 한글 뜻을 삽입할 겁니다.

         2. 사용자에게 영단어를 입력받아서, 이미 Map에 존재하는 단어라면
          다시 입력받으세요. (이미 존재한다는 메세지 출력)
          영단어 입력창에 '그만' 이라고 입력하면 입력을 종료해 주세요.

         3. 영단어 입력 후에는 한글 뜻을 입력받아서 Map에 삽입해 주세요.

         4. 입력이 종료되면, 반복문을 이용해서
         영단어 : 뜻
         영단어 : 뜻
         영단어 : 뜻.... 형태로 입력받은 영단어와 뜻을 모두 출력해 주세요.
         */
        Scanner sc= new Scanner(System.in);


        Map<String,String> engkor = new HashMap<>();

        System.out.println("키(영어)와 값(한글)을 입력해 주세요");
        System.out.println("키값 입력창에서 '그만'을 입력할 시 종료됩니다.");
        while (true){
            System.out.println("영단어: ");
            String eng=sc.next();
            if(eng.equals("그만")){
                System.out.println("프로그램 종료");
                break;
            }
            else if(engkor.containsKey(eng)){
                System.out.println("이미 존재하는 키 값입니다.");
                continue;
            }
            System.out.println("한글: ");
            String kor=sc.next();
            engkor.put(eng,kor);
            System.out.println("영단어 등록완료!\n");
        }

        makeLine();

        Set<String> keys = engkor.keySet();

        for (String key : keys) {
            System.out.printf("영단어: %s , 뜻: %s \n",key,engkor.get(key));
        }


    }
}
