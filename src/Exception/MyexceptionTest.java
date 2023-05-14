package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyexceptionTest {
    public static void main(String[]args){
        try{
            int num=getNum();
        }catch(InputMismatchException e){
            System.out.println("오류 발생!");
            e.printStackTrace();
        }
    }
    public static int getNum() throws InputMismatchException{
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        return num;
    }
}
