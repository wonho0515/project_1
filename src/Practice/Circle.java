package Practice;
class Circle{
    double radius;
    void getRound(){
        double round=2*3.14*radius;
        System.out.println("The circumference is "+round);
    }
    void getArea(){
        double area=3.14*3.14*radius;
        System.out.printf("The area is %.2f",area);
    }
}


