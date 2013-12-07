package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.filters.FilterFactory;
import uk.me.paulswilliams.projecteuler.sequences.factories.ProductsOfThreeDigitsSequenceFactory;

import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Problem4LargestPalindromeProductSolverTest {

    @Test
    public void testDelegatesToCorrectPalindromeSequenceWithProductOfThreeDigitNumbersFilter ()
    {
        ProductsOfThreeDigitsSequenceFactory sequenceFactory = mock(ProductsOfThreeDigitsSequenceFactory.class);
        FilterFactory filterFactory = mock(FilterFactory.class);
        Sequence productsSequence = mock(Sequence.class);
        Filter palindromeFilter = mock(Filter.class);
        when(sequenceFactory.buildProductsInDecreasingOrder()).thenReturn(productsSequence);
        when(filterFactory.buildPalindromesFilter()).thenReturn(palindromeFilter);
        when(productsSequence.findFirst(palindromeFilter)).thenReturn(4321L);
        Problem4LargestPalindromeProductSolver sut = new Problem4LargestPalindromeProductSolver(sequenceFactory, filterFactory);
        assertThat(sut.solve(), is(equalTo(4321L)));

    }

    @Test
    public void endToEndSolvedProblem() {
        System.setOut(mock(PrintStream.class));
        String[] params = {};
        Problem4LargestPalindromeProductSolver.main(params);
        verify(System.out).println(906609L);
    }
}
