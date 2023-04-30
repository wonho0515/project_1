import java.util.Scanner;

public class Myproject {
        public static void main(String[] args) {
            int num = 0;
            Scanner input = new Scanner(System.in);

            while (num!=6){
                System.out.println("1. Add Furnitures");
                System.out.println("2. Delete Furnitures");
                System.out.println("3. Edit Furnitures");
                System.out.println("4. View Furnitures");
                System.out.println("5. Show a menu");
                System.out.println("6. Exit");
                System.out.println("Select one number between 1-6");;
                num=input.nextInt();
                if(num==1){
                    System.out.println("가구 식별 번호를 입력하세요 :");
                    int id = input.nextInt();
                    System.out.println("가구를 입력하세요 :");
                    String furniture=input.next();
                    System.out.println("브랜드를 입력하세요 :");
                    String brand= input.next();
                    System.out.println("가격을 입력하세요 :");
                    int price = input.nextInt();
                    System.out.println("소재를 입력하세요 :");
                    String material = input.next();
                    System.out.println("주의사항을 입력하세요 :");
                    String caution = input.next();
                }
                else if (num==2){
                    System.out.println("가구 식별 번호를 입력하세요 :");
                    int id = input.nextInt();
                }
                else if (num==3){
                    System.out.println("가구 식별 번호를 입력하세요 :");
                    int id = input.nextInt();
                }
                else if (num==4){
                    System.out.println("가구 식별 번호를 입력하세요 :");
                    int id = input.nextInt();
                }

            }


        }

    }