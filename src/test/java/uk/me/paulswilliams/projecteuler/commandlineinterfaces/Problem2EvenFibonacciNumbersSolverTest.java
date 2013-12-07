package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.sequences.factories.FibonacciSequenceFactory;

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
        Sequence fibonacciSequence = mock(Sequence.class);
        Filter evenFilter= mock(Filter.class);
        when(fibonacciSequence.sumAll(evenFilter)).thenReturn(4321L);
        Problem2EvenFibonacciNumbersSolver sut = new Problem2EvenFibonacciNumbersSolver(fibonacciSequence, evenFilter);
        assertThat(sut.solve(100L), is(equalTo(4321L)));
    }

}
