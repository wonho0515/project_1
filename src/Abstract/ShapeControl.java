package Abstract;

public class ShapeControl {
    public static void main(String[]args){
        Shape[] s=new Shape[3];

        s[0]=new Triangle1();
        s[1]=new Rectangle();
        s[2]=new Circle1();

        for(int i=0;i<3;i++){
            s[i].draw();
        }

    }
}
