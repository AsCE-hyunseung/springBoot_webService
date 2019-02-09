package qwer;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int temp=0;
        //1. 오름차순으로 소트
        Arrays.sort(d);
        //2. 반복문으로 인덱스 0부터 차례로 더하고
        for (int index:d){
            //3. 조건문으로 budget보다 작은지 비교
            if(temp>budget){
                break;
            }
            temp+=index;
            //4. 더해준 갯수세기
            answer++;
        }
        return answer-1;//
    }
}
