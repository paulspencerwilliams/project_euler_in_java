package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import org.junit.Test;

import java.io.PrintStream;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class Problem2EvenFibonacciNumbersSolverTest
{
    @Test
    public void endToEndProblemSolved() {
        System.setOut(mock(PrintStream.class));
        String[] params = {"4000000"};
        Problem2EvenFibonacciNumbersSolver.main(params);
        verify(System.out).println(4613732L);
    }



}
