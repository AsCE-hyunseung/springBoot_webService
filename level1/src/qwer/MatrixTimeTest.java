package qwer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixTimeTest {
    MatrixTime time = new MatrixTime();
    int[][] answer = {{15, 15}, {15, 15}, {15, 15}};
    int[][] now = {{1, 4}, {3, 2}, {4, 1}};
    int[][] now1 = {{3, 3}, {3, 3}};

    @Test
    public void 테스트결과() {
        assertEquals(answer, time.solution(now, now1));
    }
}