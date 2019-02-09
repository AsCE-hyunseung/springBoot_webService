package qwer;

public class LeastCommonMultiple {
    public int solution(int[] arr) {
        int answer = lcm(arr[0], arr[1]);
        //1.최소 공배수, 최대 공약수를 구하는 함수를 구현한다.
        //2.첫번째 원소와 두번째 원소의 최소 공배수를 구한다.

        for (int i = 2; i < arr.length; i++) {
            //3.그 최소 공배수를 가지고 그 다음 원소와의 최소 공배수를 구한다.
            //4.마지막 배열의 원소까지 이 2번과정을 반복한다.
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    public int gcd(int a, int b) {//최대 공약수 구하는 함수
        while (b != 0) {
            int Temp = a % b;
            a = b;
            b = Temp;
        }
        return a;
    }

    public int lcm(int a, int b) {//최소 공배수 구하는 함수
        return (int) a * b / gcd(a, b);
    }
}
