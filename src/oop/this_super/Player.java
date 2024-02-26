package oop.this_super;

public class Player {
    String name;
    int level;
    int atk;
    int hp;

    Player(){
        System.out.println("Player의 기본 생성자 호출!");
        level =1;
        atk= 3;
        hp=50;
    }

        Player(String name){
        this();
            System.out.println("Player의 2번 생성자 호출!");
//            level =1;
//            atk= 3;
//            hp=50;
            this.name=name;
        }

        Player(String name, int hp){

            this(name);  //다른 생성자의 호출은 생성자 내에서 최상단에 위치해야 합니다.
            System.out.println("player의 3번 생성자 호출");
            this.hp=hp;
        }

        void attack(Player target){

        if(this == target){
            System.out.println("잘못된 커맨드입니다.");
            return;
        }
        //출력 메세지: x가 y를 공격합니다.
            System.out.printf("%s가 %s를 공격합니다\n",this.name,target.name);

        //맞는 사람의 hp를 때리는 사람의 데미지 만큼 낮추고, 나의 체력을 5 회복하고 싶다.
        //결과 출력 (나의 체력:xx , 상대 체력:xx)
        target.hp -= this.atk;
        this.hp +=5;
            System.out.printf("나의 체력: %d, 상대 체력: %d\n",this.hp,target.hp);

        }




    void characterInfo(){
        System.out.println("***캐릭터의 정보***");
        System.out.println("#아이디: "+name);
        System.out.println("#레벨: "+level);
        System.out.println("#공격력: "+atk);
        System.out.println("#체력: "+hp);
    }

}
