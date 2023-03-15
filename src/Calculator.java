import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){
        int one, two; //정수형 변수 one, two 선언

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 :");
        one = sc.nextInt();
        System.out.println("정수를 입력하세요 :");
        two = sc.nextInt();

        System.out.println("입력받은 정수 값 ="+one+","+two);
        System.out.println(one+"+"+two+"="+(one+two));
        System.out.println(one+"-"+two+"="+(one-two));
        System.out.println(one+"*"+two+"="+one*two);
        System.out.println(one+"/"+two+"="+one/two);
    }
}
