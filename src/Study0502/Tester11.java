package Study0502;

public class Tester11 {
    public static void main(String[]args){
        Calculator1 cal=new Calculator1();
        int a=cal.sum(1,2);
        double b=cal.sum(1.1,1.9);
        String c=cal.sum("hi","bye");
        String d=cal.sum('a','b');

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
