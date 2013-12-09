package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Problem4LargestPalindromeProductSolverTest {


    @Test
    public void endToEndSolvedProblem() {
        System.setOut(mock(PrintStream.class));
        String[] params = {};
        Problem4LargestPalindromeProductSolver.main(params);
        verify(System.out).println(906609L);
    }
}
