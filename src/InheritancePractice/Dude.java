package InheritancePractice;

public class Dude {
    public String name;
    public int hp =100;
    public int mp=0;

    public void sayName(String name){
        this.name=name;
        System.out.println(name);
    }
    public void punchFace(Dude target){
        target.hp-=10;
    }
}
