package Study0502;

public class Tester14 {
    public static void main(String[]args){
        /*Level mylevel=Level.MEDIUM;

        System.out.println(mylevel);
        System.out.println(mylevel.ordinal());
        System.out.println(mylevel.name());*/
        Level mylevel=Level.MEDIUM;
        switch(mylevel){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
