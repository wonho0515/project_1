package Practice;

import java.util.concurrent.ThreadLocalRandom;

public class Import_ex {
        public static void main (String args[]) {
            int min = 0, max = 100;
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println ("Random Number=" + randomNum);
        }
    }

