package InheritancePractice;

import java.lang.reflect.Array;

public class Tester2 {//다이나믹 바인딩을 효과를 볼수있는 예제
    public static void main(String[]args){
        Animal[] animals=new Animal[3];

        animals[0] = new Dog(); //이 과정에서 자식 Dog클래스가 upcasting됨.
        animals[1] = new Cat();
        animals[2] = new Cow();

        for(int i=0;i<3;i++){
            animals[i].bark();
        }
    }
}
