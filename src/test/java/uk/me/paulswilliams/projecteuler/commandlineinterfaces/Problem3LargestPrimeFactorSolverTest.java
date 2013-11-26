package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.filters.FilterFactory;
import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.sequences.factories.PrimesSequenceFactory;

import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
        PrimesSequenceFactory sequenceFactory = mock(PrimesSequenceFactory.class);
        FilterFactory filterFactory = mock(FilterFactory.class);
        Sequence primesSequence = mock(Sequence.class);
        when(sequenceFactory.buildDecreasingPrimesSequence(10L)).thenReturn(primesSequence);
        Filter factorFilter = mock(Filter.class);
        when(filterFactory.buildFactorOfFilter(100L)).thenReturn(factorFilter);
        when(primesSequence.findFirst(factorFilter)).thenReturn(4321L);
        Problem3LargestPrimeFactorSolver sut = new Problem3LargestPrimeFactorSolver(sequenceFactory, filterFactory);
        assertThat(sut.solve(100L), is(equalTo(4321L)));
    }
}
