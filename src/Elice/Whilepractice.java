package Elice;
import java.util.Scanner;
public class Whilepractice {
    public static void main(String[] args) {
        for (int i = 1; i <=3; i++) {
            for (int j =0 ; j <3-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i>0;i--){
            for(int j=0;j<3-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


