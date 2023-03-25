package assignment;

import java.util.Scanner;

public class Echo {
    public static void main(String[] args){
        String air, cloud; //air와 cloud변수를 문자열로 선언
        Scanner sc = new Scanner (System.in);
//문자열을 입력받고 next와 nextLine을 활용하여 문자열을 출력
        System.out.println("오늘의 날씨 :");
        air = sc.nextLine (); //입력 받은 오늘의 날씨 정보를 air에 저장
        System.out.println("구름 높이 :");
        cloud = sc.next(); //입력 받은 구름 높이에 관한 정보를 cloud에 저장
        System.out.println("Today weather = " +air);
        System.out.println("cloud height = " +cloud);
    }
}
