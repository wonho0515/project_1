package Exception;

import java.util.Scanner;

//실행결과를 묻거나 throw관련 빈칸 채우기 문제(자기 자신의 exception도 만들줄 알아야함
//1인칭 3인칭 구분
public class MyExceptionTest1 {
    public static void main(String[]args){
        try{
            int num=readNum();
        }catch(MyException e){
            System.out.printf("Error, the number %d is odd!",e.getNum());
        }
    }
    public static int readNum() throws MyException{
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        if(num%2 !=0){
            throw new MyException(num);
        }
        return num;
    }
}
