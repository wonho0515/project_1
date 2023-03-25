import java.util.Scanner;

public class Ifstatement {
    public static void main(String[] args){
        System.out.println("Input Number :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num>0){
            System.out.println("positive number");
        }
        else if(num<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("zero");
        }
    }
}
