package uk.me.paulswilliams.projecteuler.problem1;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratorBackedSequenceTest {


    private GeneratorBackedSequence sut;
    private Filter filter;

    @Before
    public void setUp() {
        NumberGenerator numberGenerator = mock(NumberGenerator.class);
        Iterator<Long> iterator = mock(Iterator.class);
        sut = new GeneratorBackedSequence(numberGenerator);
        when(numberGenerator.iterator()).thenReturn(iterator);
        when(iterator.hasNext()).thenReturn(true, true, true, false);
        when(iterator.next()).thenReturn(1L, 2L, 3L);
        filter = mock(Filter.class);
    }

    @Test
    public void testCanReturnMatchingFirstNumber() {

        when(filter.matches(1L)).thenReturn(true);
        assertThat(sut.findFirst(filter), is(equalTo(1L)));
    }



    @Test
    public void testCanReturnMatchingSecondNumber() throws Exception {
        when(filter.matches(1L)).thenReturn(false);
        when(filter.matches(2L)).thenReturn(true);
        assertThat(sut.findFirst(filter), is(equalTo(2L)));
    }

    @Test(expected=NoMatchFoundException.class)
    public void testExceptionIsThrownForNoMatch ()
    {
        sut.findFirst(filter);
    }

}
