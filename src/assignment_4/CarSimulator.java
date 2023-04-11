package assignment_4;

import assignment_4.Car;

import java.util.Scanner;

public class CarSimulator {
    public static void main(String[]args){
        Car sim=new Car(2011,"KIA",80.2);
        Car sim1=new Car(2016,"HONDA",100);
        Car sim2=new Car(2022,"Tesla",140.2);


        Scanner input=new Scanner(System.in);
        System.out.println("어떤 자동차를 보러오셨나요?(오름차순으로 좋은차)");
        int num = input.nextInt();

        switch(num){
            case 1:
                int year=sim.getYear();
                String make=sim.getMake();
                double speed= sim.getSpeed();
                System.out.printf("생산년도 = %d, 회사 = %s, 최고속도 = %.1f",year,make,speed);
            case 2:
                int year1=sim1.getYear();
                String make1=sim1.getMake();
                double speed1= sim1.getSpeed();
                System.out.printf("생산년도 = %d, 회사 = %s, 최고속도 = %.1f",year1,make1,speed1);
            case 3:
                int year2=sim2.getYear();
                String make2=sim2.getMake();
                double speed2= sim2.getSpeed();
                System.out.printf("생산년도 = %d, 회사 = %s, 최고속도 = %.1f",year2,make2,speed2);
        }

    }
}
