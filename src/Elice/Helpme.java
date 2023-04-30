package Elice;

public class Helpme {
    public static void main(String args[]){
        Please obj1=new Please();
        Please obj2=new Please();
        Please.numStudentRegistered=2;
        System.out.println(obj1.numStudentRegistered);
        System.out.println(obj2.numStudentRegistered);
    }
}
