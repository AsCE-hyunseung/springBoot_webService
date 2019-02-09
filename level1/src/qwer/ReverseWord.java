package qwer;

public class ReverseWord {
    String solution(String str) {
        String answer = "";
        String[] splitWord = str.split(" ");//공백 기준으로 단어 자르기

        answer = getAnswer(answer, splitWord);

        return answer.substring(0, answer.length() - 1);//맨 뒤의 공백 제거
    }

    private String getAnswer(String answer, String[] splitWord) {
        for (int i = splitWord.length - 1; i >= 0; i--) {//역순
            answer = answer.concat(splitWord[i] + " ");
        }
        return answer;
    }
}
