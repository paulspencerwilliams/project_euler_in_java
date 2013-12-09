package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Problem3LargestPrimeFactorSolverTest {

    @Test
    public void endToEndSolvedProblem() {
        System.setOut(mock(PrintStream.class));
        String[] params = {"600851475143"};
        Problem3LargestPrimeFactorSolver.main(params);
        verify(System.out).println(6857L);
    }


}
