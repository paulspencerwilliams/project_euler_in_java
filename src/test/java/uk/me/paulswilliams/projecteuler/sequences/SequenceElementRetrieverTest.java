package uk.me.paulswilliams.projecteuler.sequences;


import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SequenceElementRetrieverTest {

    private SequenceElementRetriever sut;
    private Sequence sequence;
    private Iterator<Long> iterator;

    @Before
    public void setUp() {
        sut = new SequenceElementRetriever();
        sequence = mock(Sequence.class);
        iterator = mock(Iterator.class);
        when(sequence.iterator()).thenReturn(iterator);
        when(iterator.hasNext()).thenReturn(true, true, false);
        when(iterator.next()).thenReturn(123L, 456L);
    }

    @Test
    public void testReturnsFirstElementFromASequence(){
        assertThat(sut.retrieveNthElement(sequence, 1),is(equalTo(123L)));
    }

    @Test
    public void testReturnsSecondElementFromASequence(){
        assertThat(sut.retrieveNthElement(sequence,2),is(equalTo(456L)));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testThrowsExceptionIfNthElementDoesNotExist ()
    {
        sut.retrieveNthElement(sequence,3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowsExceptionIfNIs0 ()
    {
        sut.retrieveNthElement(sequence,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowsExceptionIfNIsNegative ()
    {
        sut.retrieveNthElement(sequence,-1);
    }


}
