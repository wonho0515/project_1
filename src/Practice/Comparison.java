package Practice;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("비교할 숫자를 입력하세요 :");
        int a = input.nextInt();
        System.out.println("비교할 숫자를 입력하세요 :");
        int b = input.nextInt();

        if(a>b){
            System.out.printf("더 큰 숫자는 %d 입니다", a);
        }
        else if (a<b) {
            System.out.printf("더 큰 숫자는 %d 입니다", b);
        }
        else {
            System.out.printf("숫자는 동일합니다.");
        }
    }
}
