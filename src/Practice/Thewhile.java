package Practice;

import java.util.Scanner;

public class Thewhile {
    public static void main (String[] args){
        System.out.println("input number :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();


        int i = 0;
        while (i<=num){
            if (i%2==1) {
                System.out.println(i);
            }
            i=i+1;
        }
    }
}
