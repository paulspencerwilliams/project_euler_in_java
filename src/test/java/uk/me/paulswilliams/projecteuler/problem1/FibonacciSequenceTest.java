package uk.me.paulswilliams.projecteuler.problem1;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FibonacciSequenceTest {

    private Iterator<Integer> iterator;

    private void createFibonacciSequenceIterator(int stopsAt) {
        iterator = new FibonacciSequence(stopsAt).iterator();
    }

    private void invokeNext(int numberOfTimes) {
        for (int i = 0; i< numberOfTimes;i++)
        {
            iterator.next();
        }
    }

    @Test
    public void testIteratorReturns1ForFirstNumber() throws Exception {
        createFibonacciSequenceIterator(10);
        int[] expected = {1,2,3,5,8};
        for (int i = 0; i < 5; i++)
        {
            assertThat(iterator.next(), is(expected[i]));
        }
    }

    @Test
    public void testHasNextReturnsTrueUptoStopAt ()
    {
        createFibonacciSequenceIterator(3);
        assertThat(iterator.hasNext(), is(true));
        invokeNext(1);
        assertThat(iterator.hasNext(), is(true));
    }

    @Test
    public void testHasNextReturnsFalseOnStopAt ()
    {
        createFibonacciSequenceIterator(3);
        invokeNext(2);
        assertThat(iterator.hasNext(), is(false));
    }

    @Test
    public void testHasNextReturnsFalseAboveStopAt ()
    {
        createFibonacciSequenceIterator(4);
        invokeNext(3);
        assertThat(iterator.hasNext(), is(false));
    }

    @Test(expected=UnsupportedOperationException.class)
    public void testRemoveThrowsUnsupportedOperationException ()
    {
        createFibonacciSequenceIterator(10);
        iterator.remove();
    }




}
