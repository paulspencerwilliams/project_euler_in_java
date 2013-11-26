package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.filters.FilterFactory;
import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.sequences.FibonacciSequenceFactory;

import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class Problem2EvenFibonacciNumbersSolverTest
{
    @Test
    public void endToEndProblemSolved() {
        System.setOut(mock(PrintStream.class));
        String[] params = {"4000000"};
        Problem2EvenFibonacciNumbersSolver.main(params);
        verify(System.out).println(4613732L);
    }

    @Test
    public void sumReturnsSumOfEvenValuesInSequence ()
    {
        FibonacciSequenceFactory sequenceFactory = mock(FibonacciSequenceFactory.class);
        FilterFactory filterFactory = mock(FilterFactory.class);
        Sequence fibonacciSequence = mock(Sequence.class);
        when(sequenceFactory.buildIncreasingFibonacciSequenceStoppingAt(100L)).thenReturn(fibonacciSequence);
        Filter evenFilter= mock(Filter.class);
        when(filterFactory.buildEvenFilter()).thenReturn(evenFilter);
        when(fibonacciSequence.sumAll(evenFilter)).thenReturn(4321L);
        Problem2EvenFibonacciNumbersSolver sut = new Problem2EvenFibonacciNumbersSolver(sequenceFactory, filterFactory);
        assertThat(sut.solve(100L), is(equalTo(4321L)));
    }

}
