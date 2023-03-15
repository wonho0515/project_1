import java.util.Scanner;

public class Echo {
    public static void main(String[] args){
        String air, cloud;
        Scanner sc = new Scanner (System.in);
//문자열을 입력받고 next와 nextLine을 활용하여 문자열을 출력
        air = sc.nextLine ();
        cloud = sc.next();
        System.out.println("Today weather = " +air);
        System.out.println("cloud height = " +cloud);
    }
}
