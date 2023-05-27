package fileout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tester23 {
    public static void main(String[]args){
        try{
            FileInputStream file = new FileInputStream("no.txt");

            byte[]b=new byte[1024];
            file.read(b);
            System.out.println(new String(b));
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
