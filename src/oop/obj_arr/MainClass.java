package oop.obj_arr;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
//        person p =new person("홍길동",20,"남자");
//        person p2 =new person("홍길동2",30,"남자");
//        person p3 =new person("홍순이",40,"여자");
//        p.personsInfo();
//        p2.personsInfo();
//        p3.personsInfo();

//        int[] arr=new int[3];
//        person[] people = new person[3];
//        people[0]=new person()

        person[] people = {
                new person("홍길동",20,"남자"),
                new person("홍길동2",30,"남자"),
                new person("홍순이",40,"여자")
        };

//        System.out.println(Arrays.toString(people));

//    people[0].personsInfo();
//    people[1].personsInfo();
//    people[2].personsInfo();

//        for (int i = 0; i <people.length ; i++) {
//            people[i].personsInfo();
//        }

        //iter (단축키)
        for (person p : people) {
            p.personsInfo();
        }

    }
}
