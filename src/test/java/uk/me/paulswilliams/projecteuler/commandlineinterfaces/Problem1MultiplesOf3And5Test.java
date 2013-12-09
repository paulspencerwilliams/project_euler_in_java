package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Problem1MultiplesOf3And5Test {

    @Test
    public void endToEndSolvedProblem() {
        System.setOut(mock(PrintStream.class));
        String[] params = {"1000"};
        Problem1MultiplesOf3And5Solver.main(params);
        verify(System.out).println(233168L);
    }

	
}
