package Practice;

public class Break {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            if(i==5) break;
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d*%d=%d\t",i,j,i*j);
            }
            System.out.println(" ");
        }
    }
}