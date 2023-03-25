import java.util.Scanner;

public class Bonus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("이번달 판매금액을 입력하세요 : ");
        int sell = input.nextInt();

        if(sell>=10000000){
            int bonus = 1000000;
            System.out.printf("이번달 월급 보너스는 %d 입니다.",bonus);
        }
        else{
            System.out.println("이번달 월급 보너스는 없습니다 ㅋ");
        }
    }
}
