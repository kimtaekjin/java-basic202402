package oop.obj_arr;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {

                /*
         - 스캐너를 이용하여 Person객체를 생성하는 데 필요한
          정보를 입력받으시면 되겠습니다. (이름,나이  ,성별)
          입력받은 정보를 토대로 Person객체를 생성한 후
          여러 개의 Person 객체를 배열에다 담아 둘 생각입니다.

         - 배열의 크기는 3개로 하겠습니다. 반복문을 이용하여
          입력을 반복해서 받아주시면 됩니다.

         - 입력이 끝나면 배열 안에 있는 모든 주소값을 순회하여
          각 객체의 personInfo()를 호출해 보세요.
         */


                Scanner sc = new Scanner(System.in);

                // Person 객체 배열 선언
                person[] people = new person[3];
                for (int i = 0; i < people.length; i++) {
                    System.out.println("이름을 입력하세요:");
                    String name = sc.next();
                    System.out.println("나이를 입력하세요:");
                    int age = sc.nextInt();
                    System.out.println("성별을 입력하세요:");
                    String gender = sc.next();
                    System.out.printf("이름: %s, 나이: %d, 성별: %s%n", name, age, gender);

                    // 입력 받은 정보로 Person 객체 생성 및 배열에 저장
                    people[i] = new person(name, age, gender);
                    System.out.println("***정보 입력 완료***");
                }

                System.out.println("------------------------------");
                // 배열에 저장된 각 Person 객체의 정보 출력
                for (person person : people) {
                    person.personsInfo();
                }
            }
        }