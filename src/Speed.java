import java.util.Scanner;

public class Speed {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("100미터 달리기 기록을 입력 하시오 :");
        double time = sc.nextDouble();
        double fast = 100/time*3.6;

        System.out.printf("당신의 시속은 : %.2f", fast);
    }
}
