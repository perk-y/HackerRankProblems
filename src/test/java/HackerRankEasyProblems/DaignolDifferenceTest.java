package HackerRankEasyProblems;

import org.junit.Test;

import static org.junit.Assert.*;

public class DaignolDifferenceTest {

    @Test
    public void diagonalDifference() {
        int[][] array = {{1,2,3},{2,3,4},{3,4,5}};
        assertEquals(0,DaignolDifference.diagonalDifference(array));
    }
}