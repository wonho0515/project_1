package assignment_9;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class InputStrLog {
    public static void main(String[] args) {
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(str);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            FileWriter file = new FileWriter("Assignment.txt");
            System.out.println("문자열을 입력하세요 :");
            String input;

            while((input=in.readLine())!=null &&!input.isEmpty()){
                if(!input.isEmpty()){
                    Date date=new Date();
                    file.write(format.format(date));
                    file.write(" "+input);
                    file.write("\n");
                }
            }

            file.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

