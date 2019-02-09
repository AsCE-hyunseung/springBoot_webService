package qwer;

public class RemoveChars {
    String solution(String str, String remove) {
        String[] reject = remove.split("");//제거해야할 알파벳들을 한글자씩 분리

        return rejectElement(str, reject);
    }

    private String rejectElement(String str, String[] reject) {
        for (String s : reject) {
            str = str.replace(s, "");//replace()함수를 이용해서 해당 알파벳만 제거
        }
        return str;
    }
}
