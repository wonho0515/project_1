package assignment_8;

import java.util.Scanner;

public class MyExceptionTester1 {
    public static void main(String[]args) {

        while (true) {
            try {
                int num = inputNum();
                System.out.printf("입력된 값은 %d 입니다", num);
                break;
            } catch (MyException1 e) {
                System.out.printf("Error, 입력된 값 %d는 홀수입니다!", e.getNum());
                System.out.println();
            }
        }
    }
    public static int inputNum() throws MyException1 {
        Scanner input=new Scanner(System.in);
        System.out.println("정수를 입력해주세요 :");
        int num=input.nextInt();
        if(num%2 !=0){
            throw new MyException1(num);
        }
        return num;
    }
}
