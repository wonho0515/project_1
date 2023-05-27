package Serialization;

import java.io.*;

public class Tester30 {
    public static void main(String[]args){
        try{
            FileInputStream fis=new FileInputStream("ot.bak");
            ObjectInputStream oi=new ObjectInputStream(fis);
            Point p=(Point) oi.readObject();
            System.out.println(p.x+" "+p.y);
            oi.close();
            fis.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
