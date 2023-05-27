package assignment_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("숫자를 입력하세요 : ");
            int a = input.nextInt();
            System.out.println("숫자를 입력하세요 : ");
            int b = input.nextInt();

            int result = a + b;

            System.out.println("두 숫자의 합은 : " + result);
        }
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException, 정수를 입력하세요.");
        }
    }
}
