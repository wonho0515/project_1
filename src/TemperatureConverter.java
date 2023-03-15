import java.util.Scanner;

public class TemperatureConverter {
    public static void main (String[] args){
        int f_tem;
        double c_tem;

        Scanner sc = new Scanner(System.in);
        System.out.println("화씨 온도를 입력하세요 :");
        f_tem = sc.nextInt();

        c_tem = (double)5/9*(f_tem-32); // 5/9가 0이 나오기때문에 double형으로 형변환
        System.out.printf("섭씨 온도 : %.3f", c_tem); // double형을 출력하기위해 printf사용, c_tem은 소수점 3자리까지 표현
    }
}
