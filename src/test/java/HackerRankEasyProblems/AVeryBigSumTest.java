package HackerRankEasyProblems;

import org.junit.Test;

import static org.junit.Assert.*;

public class AVeryBigSumTest {

    @Test
    public void aVeryBigSum() {
        long[] arr = {1000000001, 1000000002 ,1000000003, 1000000004 ,1000000005};
        assertEquals(5000000015L , AVeryBigSum.aVeryBigSum(arr));
    }
}