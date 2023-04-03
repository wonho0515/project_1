package assignment;

import java.util.HashSet;

public class Wordsnum {
    public static void main(String[] args) {
        System.out.println("Fools Garden : Lemon Tree"); //노래 가수 및 제목 출력
        String song = "I am sitting here in a boring room" //문자열 변수 song에 노래 가사 저장
                + " It is just another rainy Sunday afternoon"
                + " I am wasting my time I got nothing to do"
                + " I am hanging around I am waiting for you"
                + " But nothing ever happens and I wonder"
                + " I am driving around in my car";

        String[] words = song.split(" "); //" "공백을 기준으로 문자열을 나누어 배열에 저장

        int wordsnum = words.length; //전체 단어 수
        System.out.println("Total number of words: " + wordsnum);

        HashSet<String> all = new HashSet<String>(); //중복되지 않는 단어를 저장할 HashSet클래스 변수 all선언
        for(int i = 0; i < words.length; i++){ //배열 words에 있는 모든 요소들을 all에 추가
            all.add(words[i]);
        }
        System.out.println("Number of words in HashSet : " + all.size()); //all안에 들어있는 원소의 개수를 출력

        HashSet<String> set = new HashSet<String>(); //중복되지 않는 소문자 단어를 저장할 HashSet클래스 변수set선언
        for (int j = 0; j < words.length; j++) { //배열 words에 있는 모든 요소들을 소문자로 변환시킨 후 set에 추가
            set.add(words[j].toLowerCase());
        }
        System.out.println("Number of words in set after toLowerCase: " + set.size()); //set안에 들어있는 원소의 개수를 출력
    }
}


