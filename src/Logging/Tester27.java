package Logging;


import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tester27 {
    public static void main(String[]args){
        Date d1=new Date();
        System.out.println();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            FileOutputStream file = new FileOutputStream("TimeLog.txt");
            file.write(format.format(d1).getBytes());
            file.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
