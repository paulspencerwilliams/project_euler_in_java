package uk.me.paulswilliams.projecteuler;

import org.junit.Before;
import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.NoMatchFoundException;
import uk.me.paulswilliams.projecteuler.SequenceAnalyserImpl;
import uk.me.paulswilliams.projecteuler.sequences.Sequence;

import java.util.Iterator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SequenceAnalyserImplTest {


    private SequenceAnalyserImpl sut;
    private Filter filter;
    private Sequence sequence;

    @Before
    public void setUp() {
        sequence = mock(Sequence.class);
        Iterator<Long> iterator = mock(Iterator.class);
        sut = new SequenceAnalyserImpl();
        when(sequence.iterator()).thenReturn(iterator);
        when(iterator.hasNext()).thenReturn(true, true, true, false);
        when(iterator.next()).thenReturn(1L, 2L, 3L);
        filter = mock(Filter.class);
    }

    @Test
    public void testFindFirstCanReturnMatchingFirstNumber() {
        when(filter.matches(1L)).thenReturn(true);
        assertThat(sut.findFirst(sequence, filter), is(equalTo(1L)));
    }



    @Test
    public void testFindFirstCanReturnMatchingSecondNumber() {
        when(filter.matches(1L)).thenReturn(false);
        when(filter.matches(2L)).thenReturn(true);
        assertThat(sut.findFirst(sequence, filter), is(equalTo(2L)));
    }

    @Test(expected=NoMatchFoundException.class)
    public void testFindFirstThrowsExceptionWhenNoMatchIsFound()
    {
        sut.findFirst(sequence, filter);
    }

    @Test
    public void testSumAllCanSumAllEntries() {
        when(filter.matches(anyLong())).thenReturn(true);
        assertThat(sut.sumAll(sequence, filter), is(equalTo(6L)));
    }

    @Test
    public void testSumAllOnlyAddsMatches() throws Exception {
        when(filter.matches(1L)).thenReturn(false);
        when(filter.matches(2L)).thenReturn(true);
        assertThat(sut.sumAll(sequence, filter), is(equalTo(2L)));
    }

}
