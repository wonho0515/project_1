package Practice;//기본연산자는 크기가 고정, 참조 연산자는 크기 고정 아직
//크기ㅡㄹㄹ 알수 없는 참조연산자는 메모리공간에 값을 넣는게 아니라 위치(주소)만 넣어서 그 위치에 접근해서 오브젝트에 접근

import java.util.ArrayList;
import java.util.HashSet;

public class Arraylist {
    public static void main(String[]args){
        HashSet<String> set = new HashSet<String>();//set은 순서가 상관없음
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("ham");
        System.out.println(set);
    }
}
