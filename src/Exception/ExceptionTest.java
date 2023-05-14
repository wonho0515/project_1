package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            Scanner in=new Scanner(System.in);
            int num=in.nextInt();
        }catch(InputMismatchException e){
            System.out.println("오류 발생!!!!");
            e.printStackTrace();
        }
        finally{
            System.out.println("The End!");
        }
    }
}
