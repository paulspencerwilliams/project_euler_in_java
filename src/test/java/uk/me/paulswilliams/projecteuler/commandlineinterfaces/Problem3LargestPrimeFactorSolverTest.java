package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.Sequence;

import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;

public class Problem3LargestPrimeFactorSolverTest {

    @Test
    public void endToEndSolvedProblem() {
        System.setOut(mock(PrintStream.class));
        String[] params = {"600851475143"};
        Problem3LargestPrimeFactorSolver.main(params);
        verify(System.out).println(6857L);
    }

    @Test
    public void testDelegatesToPrimeSequenceWithSquareRootOfParamAndFactorFilter ()
    {
        Sequence primesSequence = mock(Sequence.class);
        Filter factorFilter = mock(Filter.class);
        when(primesSequence.findFirst(factorFilter)).thenReturn(4321L);
        Problem3LargestPrimeFactorSolver sut = new Problem3LargestPrimeFactorSolver(primesSequence, factorFilter);
        assertThat(sut.solve(100L), is(equalTo(4321L)));
    }
}
