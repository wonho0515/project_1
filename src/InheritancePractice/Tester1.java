package InheritancePractice;

import java.util.Scanner;

public class Tester1 {
    public static void main(String[]args){
        GrandWizard grandWizard=new GrandWizard();
        Wizard wizard1=new Wizard();
        Dude dude1=new Dude();

        grandWizard.name="Flash";
        grandWizard.sayName();
        wizard1.punchFace(dude1);
        dude1.sayName("Monster");
        System.out.println(dude1.hp);
        wizard1.sayName("Herry");
        dude1.punchFace(wizard1);
        System.out.println(wizard1.hp);
    }
}
