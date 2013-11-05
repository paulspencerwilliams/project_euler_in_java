package uk.me.paulswilliams.projecteuler.problem1;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ProblemSolverTest
{


    @SuppressWarnings("unchecked")
    @Test
    public void sumReturnsSumOfEvenValuesInSequence ()
    {
        NumberFilter evenFilter = mock(NumberFilter.class);
        Iterable<Integer> fibonacciSequence = mock(Iterable.class);
        Iterator<Integer> iterator = mock(Iterator.class);
        when(evenFilter.matches(2)).thenReturn(true);
        when(evenFilter.matches(4)).thenReturn(true);
        when(fibonacciSequence.iterator()).thenReturn(iterator);
        when(iterator.hasNext()).thenReturn(true, true, true, false);
        when(iterator.next()).thenReturn(1,2,4,7);
        assertThat(new ProblemSolver().sum(fibonacciSequence, evenFilter), is(equalTo(6)));
    }

}
