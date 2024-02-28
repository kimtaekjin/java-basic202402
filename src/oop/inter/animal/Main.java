package oop.inter.animal;

public class Main {
    public static void main(String[] args) {


        /*
        -다형성은 상속이 전제되어야 하는 것이 원칙이지만
        예외로 인터페이스와 클래스간의 구현 관계에서도
        다형성 발생을 허용.
         */
        Animal duck = new Duck();
        Huntable bulldog = new Bulldog();
        violent shark = new shark();
        bedAnimal bear = new bear();
                /*
         - 인터페이스의 다형성도 앞에서 배운 클래스의 다형성처럼
          정보가 없다면 메서드 호출이 불가능하기 때문에 형 변환이 필요합니다.

         - 구현하는 클래스가 서로 다른 인터페이스들을 동시에 구현하고 있다면
          구현하는 클래스들끼리 서로 즉시 형 변환이 가능합니다.
         */

        //bear의 타입은 beadAnimal ->fdd()에 대한 정보 없음 ->Animal 타입으로 즉시 형변환 가능
        //->bear 클래스가 결국 Animal과 연관이 있기 때문에 가능.
        ((Animal)bear).feed("과일");

        Animal[] animals={duck, (Animal) bulldog, (Animal) bear, (Animal) shark};

    }
}
