package fileout;

import java.io.*;


public class Tester24 {
    public static void main(String[]args){
        try{
            FileWriter fileWriter = new FileWriter("text.txt",true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Hello");
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
