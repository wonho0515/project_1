import java.util.Scanner;

public class TemperatureConverter {
    public static void main (String[] args){
        int f_tem; //화씨온도를 정수형 표현
        double c_tem; //섭씨온도를 실수형 표현

        Scanner sc = new Scanner(System.in); //입력받기위해 Scanner 클래스 활용
        System.out.println("화씨 온도를 입력하세요 :");
        f_tem = sc.nextInt(); //화씨 온도를 입력받고 f_tem에 저장

        c_tem = (double)5/9*(f_tem-32); // 5/9가 0이 나오기때문에 double형으로 형변환
        System.out.printf("섭씨 온도 : %.3f",c_tem); // c_tem을 소수점 3자리까지만 표현해주기
        // 위해 서식문자를 활용해준다. 그렇기 때문에 printf를 사용한다.
    }
}
