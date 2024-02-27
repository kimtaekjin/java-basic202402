package oop.poly.player;

import oop.poly.player.Player;


    /*
     # 메서드 오버라이딩(재정의)
     - 부모가 물려주는 메서드는 모든 자식들에게 다 맞게 설계되기 힘들기 때문에
      부족한 점이 있거나, 아예 맞지 않는 경우에는 자식 클래스 쪽에서
      내용을 추가하거나 수정할 수 있습니다. 이를 오버라이딩 이라고 합니다.

     - 만약 자식 클래스에서 부모가 물려준 메서드를 새롭게 재 정의한다면
      자식이 수정한 메서드가 우선적으로 호출됩니다.

     - 오버라이딩의 규칙이 있습니다. (3가지 모두 일치해야 오버라이딩 인정)
     1. 부모가 물려주는 메서드와 이름이 똑같을 것!
     2. 부모가 물려주는 메서드와 리턴 타입이 똑같을 것!
     3. 부모가 물려주는 메서드와 매개변수의 선언 방식이 똑같을 것!
     */


public class warrior extends Player {
int rage;
warrior(String name){
    super(name);
    this.rage=60;
}
public  void rush(Player p) {
/*
         - 전사의 고유 기능인 rush 메서드를 작성합니다.

         - rush의 대상은 모든 직업들 입니다.

         - 만약 rush의 대상이 전사라면 10의 피해를 받고,
          마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.

         - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.

         - 남은 체력도 출력해 주세요.

         - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
         */

    System.out.printf("%s님이 %s님에게 돌진을 시전하였습니다.\n",this.name,p.name);
    int damage = 0; String job="";
    if(p instanceof warrior){
        damage=10; job="전사";
    }else if(p instanceof  mage){
        damage=20; job="마법사";
    }else if(p instanceof Hunter){
        damage=15; job="헌터";
    }
    p.hp-=damage;
    System.out.printf("%s님(%s)이 %d의 피해를 입었습니다.\n",p.name,job,damage);
    System.out.printf("%s님의 남은 체력: %d\n",p.name,p.hp);
    System.out.println("--------------------------------");


}
    @Override
    void characterInfo() {
        super.characterInfo();
        this.rage=30;
        System.out.println("#분노: "+rage);
    }
}
