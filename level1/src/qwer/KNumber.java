package qwer;

//1.array를 i에서 j까지 자른다. commands(i,j,k)
//2.생성된 임시 배열에 넣는다.
//3.소트한다.
//4.k번째의 인덱스의 원소를 return배열에 넣는다.

import java.util.Arrays;

public class KNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];//정답의 최대 크기는 commans.length이다.

        int temp_index = 0;
        int answer_index = 0;

        for (int i = 0; i < commands.length; i++) {
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];//임시 배열을 j-i크기로 잡았다.(소팅때문에)

            InsertTemp(array, commands[i], temp_index, temp);//임시 배열에 i부터 j까지 원소를 넣었다.
            temp_index = 0;
            Arrays.sort(temp);

            answer[answer_index] = temp[commands[i][2] - 1];//k는 commands[i][2]에 들어있다.
            answer_index++;
        }
        return answer;
    }

    public void InsertTemp(int[] array, int[] command, int temp_index, int[] temp) {
        for (int j = command[0] - 1; j < command[1]; j++) {//i번째부터 j번째까지
            temp[temp_index] = array[j];
            temp_index++;
        }
    }
}
