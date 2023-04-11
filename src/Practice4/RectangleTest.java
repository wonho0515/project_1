package Practice4;
import java.awt.Rectangle;
public class RectangleTest {
    public static void main(String[]args){
        Rectangle box = new Rectangle(5,10,20,30);
        Rectangle box2,box3;

        System.out.println("Box : width ="+box.getWidth()+" ");
        System.out.println("height = "+box.getHeight());

        box2=box;
        box2.setSize(10,15);

        System.out.print("Box : width = "+box.getWidth()+" ");
        System.out.println("height = "+box.getHeight());

        box3=box2;
        box3.setSize(30,40);

        System.out.print("Box : width = "+box.getWidth()+" ");
        System.out.println("height = "+box.getHeight());
    }
}
