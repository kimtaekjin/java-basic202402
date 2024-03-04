package etc.api.collection.list;

import javax.naming.Name;

public class User {

    private int age;
    private String Name;

    public User(int age, String name) {
        this.age = age;
        this.Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "나이=" + age +
                ", 이름='" + Name + '\'' +
                '}';
    }
}
//         - forEach(향상 for문)을 사용하여 반복문을 순회할 때
//리스트의 크기를 마음대로 줄이거나 늘릴 수 없습니다.
//         - 향상 for문은 반복문을 시작할 때 구조적으로 컬렉션의
//크기 및 사용 가능한 요소들의 개수를 항상 파악하고 있기 때문에
//값의 변경이 일어나면 예외를 발생시키도록 설계되어 있습니다.