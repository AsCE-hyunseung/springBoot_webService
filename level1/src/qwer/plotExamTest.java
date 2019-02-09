package qwer;


import org.junit.Test;

import static org.junit.Assert.*;

public class plotExamTest {
    plotExam p = new plotExam();
    int[] answer1 = {1, 2, 3, 4, 5};
    int[] answer2 = {1, 3, 2, 4, 2};
    int[] result1 = {1};
    int[] result2 = {1, 2, 3};

    @Test
    public void 테스트_결과() {
        assertArrayEquals(result1, p.solution(answer1));
        assertArrayEquals(result2, p.solution(answer2));
    }
}
