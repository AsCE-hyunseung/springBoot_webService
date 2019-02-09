package qwer;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {
    Printer p = new Printer();
    int[] arr1 = {2, 1, 3, 2};
    int[] arr2 = {1, 1, 9, 1, 1, 1};

    @Test
    public void 테스트결과() {
        assertEquals(1, p.solution(arr1, 2));
        assertEquals(5, p.solution(arr2, 0));
    }
}
