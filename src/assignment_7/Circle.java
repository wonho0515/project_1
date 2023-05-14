package assignment_7;

public class Circle extends Shape{
    int r;
    Circle(int r){
        this.r=r;
    }

    public void getArea(){
        System.out.println("원의 크기: "+r*r*3.14);
    }
}

