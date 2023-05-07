package Study0502;

public class Date {
    private int year;
    private String month;
    private int day;


    Date(int year, String month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    Date(int year,String month){
        this.year=year;
        this.month=month;
    }
    Date(int year,int day){
        this.year=year;
        this.day=day;
    }
    Date(String month,int day){
        this.month=month;
        this.day=day;
    }
    Date(int year){
        this.year=year;
    }
    Date(String month){
        this.month=month;
    }
    void printinfo(){
        System.out.println(month+","+year+","+day);
    }
}


