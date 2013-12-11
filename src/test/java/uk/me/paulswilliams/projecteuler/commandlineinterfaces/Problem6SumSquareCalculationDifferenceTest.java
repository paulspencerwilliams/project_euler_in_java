package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Problem6SumSquareCalculationDifferenceTest {
    @Test
    public void endToEndSolvedProblem() {
        System.setOut(mock(PrintStream.class));
        String[] params = {"100"};
        Problem6SumSquareDifference.main(params);
        verify(System.out).println(25164150L);
    }
}
