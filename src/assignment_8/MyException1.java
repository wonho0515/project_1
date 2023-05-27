package assignment_8;

public class MyException1 extends Exception {
    private int num;

    public MyException1(int num){
        this.num=num;
    }

    public int getNum(){
        return num;
    }
}
