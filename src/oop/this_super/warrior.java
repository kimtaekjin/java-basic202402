package oop.this_super;

import oop.this_super.Player;

public class warrior extends Player {
int rage;


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



    @Override
    void characterInfo() {

        super.characterInfo();
        System.out.println("#분노: "+rage);
    }
}
