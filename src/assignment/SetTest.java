package assignment;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        String poem = "Hold fast to dreams" //문자열 변수 poem에 주어진 시를 저장
                + " For if dreams die"
                + " Life is a broken-winged bird"
                + " That cannot fly"
                + " Hold fast to dreams"
                + " For when dreams go"
                + " Life is a barren field"
                + " Frozen with snow";
        String[] words = poem.split(" "); //" "공백을 기준으로 문자열을 나누어 배열에 저장
        HashSet<String> set = new HashSet<String>(); //HashSet 선언

        for (int i = 0; i < words.length; i++) { //words배열에 있는 모든 요소들을 소문자로 변환시킨 후 set에 추가
            set.add(words[i].toLowerCase());
        }

        int allnum = words.length; //전체 단어 수
        int toLowerCasenum = set.size(); //중복되지 않는 소문자 단어 수

        System.out.println("Total number of words: " + allnum);
        System.out.println("Number of words in set after toLowerCase: " + toLowerCasenum);
    }
}



