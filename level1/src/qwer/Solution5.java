package qwer;

public class Solution5 {
    boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        int p = 0;
        int y = 0;
        s = s.toUpperCase();

        answer = isAnswer(s, answer, len, p, y);
        return answer;
    }

    private boolean isAnswer(String s, boolean answer, int len, int p, int y) {
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'P') {
                p++;
            }
            if (s.charAt(i) == 'Y') {
                y++;
            }
        }
        if (p != y) {
            answer = false;
        }
        return answer;
    }
}
