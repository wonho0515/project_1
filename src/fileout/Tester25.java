package fileout;

import java.io.*;

public class Tester25 {
    public static void main(String[]args){
        try{
            FileReader fileReader=new FileReader("text.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

              while(true) {
                  String s = bufferedReader.readLine();
                  System.out.println(s);
                  bufferedReader.close();
            }
            /*int c;
            while((c=fileReader.read())!=-1){
                System.out.println((char)c);
            }
            fileReader.close();*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
