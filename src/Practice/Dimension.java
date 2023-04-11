package Practice;

import java.util.Scanner;

public class Dimension {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("1.원의 넓이  2. 삼각형의 넓이\n 입력하세요 :");
        int a = input.nextInt();

        if(a==1){
            System.out.println("원의 반지름을 입력하세요 :");
            double radius=input.nextDouble();
            System.out.printf("원의 넓이는 %.2f 입니다",3.14*radius*radius);
        }
        else{
            System.out.println("삼각형의 밑변의 길이를 입력하세요 :");
            int base = input.nextInt();
            System.out.println("삼각형의 높이를 입력하세요 :");
            int height = input.nextInt();
            System.out.println("삼각형의 넓이는 :"+(base*height)/2.0);//double 형으로 변환하여 정확한 실수값을 얻기 위해 2.0사용
        }
    }
}
