package Practice;

import java.util.Scanner;

public class TriangleDimension {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("밑변을 입력하시오 :");
        int base = sc.nextInt();

        System.out.println("높이를 입력하시오 :");
        int height = sc.nextInt();

        System.out.println("삼각형의 넓이는 :"+base*height/2);

    }
}
