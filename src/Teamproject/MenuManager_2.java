package Teamproject;

import java.util.Scanner;

public class MenuManager_2 {
    public static void main(String[] args) {
        int num = 0;
        Scanner input = new Scanner(System.in);

        while (num != 6) {
            System.out.println("1. Add Furnitures");
            System.out.println("2. Delete Furnitures");
            System.out.println("3. Edit Furnitures");
            System.out.println("4. View Furnitures");
            System.out.println("5. Show a menu");
            System.out.println("6. Exit");
            System.out.println("Select one number between 1-6");
            num = input.nextInt();

            if (num == 1) {
                addfurnitures();
            }
            else if (num==2){
                deletefurnitures();
            }
            else if (num==3){
                editfurnitures();
            }
            else if (num==4){
                viewfurnitures();
            }
        }
    }
    public static void addfurnitures(){
        Scanner input=new Scanner(System.in);
        System.out.println("Furniture identification number :");
        int id=input.nextInt();
        System.out.println("Furniture name :");
        input.nextLine();
        String furniture = input.nextLine();
        System.out.println("Furniture brand :");
        String brand= input.nextLine();
        System.out.println("Furniture cost :");
        int price = input.nextInt();
        System.out.println(price); //입력받은 가격을 한번 더 출력
        input.nextLine();
        System.out.println("Furniture material :");
        String material = input.nextLine();
        System.out.println("Furniture caution :");
        String caution = input.nextLine();
        System.out.println(caution); //입력받은 주의사항을 한번 더 출력
    }
    public static void deletefurnitures(){
        Scanner input=new Scanner(System.in);
        System.out.println("Furniture identification number :");
        int id=input.nextInt();
    }
    public static void editfurnitures(){
        Scanner input=new Scanner(System.in);
        System.out.println("Furniture identification number :");
        int id=input.nextInt();
    }
    public static void viewfurnitures(){
        Scanner input=new Scanner(System.in);
        System.out.println("Furniture identification number :");
        int id=input.nextInt();
    }
}
