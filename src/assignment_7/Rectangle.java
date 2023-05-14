package assignment_7;

public class Rectangle implements Shape{
    int x,y;
    Rectangle(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void getArea(){
        System.out.println("사각형의 크기: "+x*y);
    }
}

