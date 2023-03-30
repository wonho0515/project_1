import java.util.ArrayList;
import java.util.HashSet;

public class Arraylist {
    public static void main(String[]args){
        HashSet<String> set = new HashSet<String>();//set은 순서가 상관없음
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("ham");
        System.out.println(set);
    }
}
