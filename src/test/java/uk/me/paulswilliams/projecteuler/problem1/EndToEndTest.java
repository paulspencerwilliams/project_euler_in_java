package uk.me.paulswilliams.projecteuler.problem1;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class EndToEndTest {

    @Test
    public void printsValueFromProblemSolverWithSpecifiedParameter() {
        System.setOut(mock(PrintStream.class));
        String[] params = {"4000000"};
        ProblemSolver.main(params);
        verify(System.out).println(4613732);
    }


}
