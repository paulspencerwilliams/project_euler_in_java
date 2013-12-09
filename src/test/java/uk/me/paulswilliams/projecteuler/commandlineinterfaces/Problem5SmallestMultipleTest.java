package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Problem5SmallestMultipleTest {
    @Test
    public void endToEndSolvedProblem() {
        System.setOut(mock(PrintStream.class));
        String[] params = {};
        Problem5SmallestMultiple.main(params);
        verify(System.out).println(232792560L);
    }
}
