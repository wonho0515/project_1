package assignment;

import java.util.Scanner;

public class CoinGuess {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in); //Scanner클래스 선언

        System.out.println("동전의 앞면 뒷면을 맞춰보세요~");
        String guess=input.nextLine(); //문자열 변수 guess에 입력값 저장

        int computer = (int)(Math.random()*2); //정수형 변수computer에 랜덤함수 Math.random을 활용하여 0과 1이 랜덤으로 변수에 들어가도록 설정

        if(guess.equals("앞면")){ //입력받은 값과 "앞면"이 같다면 실행
            if(computer == 0){
                System.out.println("정답입니다~");
            }
            else if(computer==1){
                System.out.println("그걸 틀리네 ㅋ");
            }
        }
        else if(guess.equals("뒷면")){ //입력받은 값과 "뒷면"이 같다면 실행
            if(computer ==0){
                System.out.println("그걸 틀리네 ㅋ");
            }
            else if(computer == 1){
                System.out.println("정답입니다");
            }
        }
    }
}
