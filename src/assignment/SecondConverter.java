package assignment;

public class SecondConverter {
    public static void main(String[] args){
        int s1, s2, m, h, d;
        s1= 100000;
        m=s1/60;
        h=m/60;
        d=h/24;
        s2=100000%60;
        System.out.printf("%d day %d hours %d minutes %d seconds\n",d,h-d*24,m-60*h,s2);

        if(d>364){
            System.out.println("1년 이상입니다.");
        }
        else{
            System.out.println(("1년 이상이 아닙니다."));
        }
    }
}
