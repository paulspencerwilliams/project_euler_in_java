package uk.me.paulswilliams.projecteuler.calculations;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.calculations.SumOfSquares;
import uk.me.paulswilliams.projecteuler.sequences.Sequence;

import java.util.Iterator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SumOfSquaresTest {
    @Test
    public void testReturns14For1_2_3() throws Exception {
        Sequence sequence = mock(Sequence.class);
        Iterator<Long> iterator = mock(Iterator.class);

        when(sequence.iterator()).thenReturn(iterator);
        when(iterator.hasNext()).thenReturn(true,true, true, false);
        when(iterator.next()).thenReturn(1L, 2L, 3L);

        assertThat(new SumOfSquares(sequence).getResult(), is(equalTo(14L)));
    }
}
