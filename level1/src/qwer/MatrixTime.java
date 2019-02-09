package qwer;

import java.lang.*;

//1. arr1의 행과 arr2의 열을 곱한다.
//2. 곱한값을 answer[arr1의 곱한 행][arr2의 곱한 열]에 삽입한다.

//결과 행렬의 크기는 arr1의 행과 arr2의 열의 크기로 나온다


public class MatrixTime {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MatrixTime m = new MatrixTime();
        int[][] now = {{1, 4}, {3, 2}, {4, 1}};
        int[][] now1 = {{3, 3}, {3, 3}};
        m.solution(now, now1);
    }
}
