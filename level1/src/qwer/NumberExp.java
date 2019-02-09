package qwer;

public class NumberExp {
    public int solution(int n) {
        int answer = 1;//자기 자신 표현
        int range = n / 2 + 1;//n/2+1까지가 범위이다.ex)15=7+8
        int sum = 0;

        for (int i = 1; i < range; i++) {
            sum = i;
            for (int j = i + 1; j <= range; j++) {
                sum += j;
                if (sum >= n)//크거나 같으면 일단 반복문을 break한다.
                    break;
            }
            if (sum == n)//만약 n과 더해진 sum이 같으면 answer을 카운트해준다.
                answer++;
        }
        return answer;
    }
}