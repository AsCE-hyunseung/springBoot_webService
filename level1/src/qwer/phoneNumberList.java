package qwer;

import java.util.*;

public class phoneNumberList {
    public boolean solution(String[] phone_book) {

//        Arrays.sort(phone_book, new Comparator<String>() {//Comparator 구현
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(),o2.length());
//            }
//        });

//        Arrays.sort(phone_book, (o1, o2) -> Integer.compare(o1.length(),o2.length()));//람다식 교체

        Arrays.sort(phone_book, Comparator.comparingInt(String::length));//Comparator.comparingInt()로 교체
        // 문자열 길이대로 정렬(짧은 순대로)
        if (checkIncludeString(phone_book)) {
            return false;
        }
        return true;
    }

    public boolean checkIncludeString(String[] phone_book) {//제일 짧은 문자열부터 시작해서 뒤의 문자열이 포함하고 있는지 체크
        for (int i = 0; i < phone_book.length; i++) {
            int len = phone_book[i].length();
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[j].substring(0, len).equals(phone_book[i])) {//체크 부분
                    return true;
                }
            }
        }
        return false;
    }
}
