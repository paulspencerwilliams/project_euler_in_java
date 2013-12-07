package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.Sequence;

import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;

public class Problem4LargestPalindromeProductSolverTest {

    @Test
    public void testDelegatesToCorrectPalindromeSequenceWithProductOfThreeDigitNumbersFilter ()
    {
        Sequence productsSequence = mock(Sequence.class);
        Filter palindromeFilter = mock(Filter.class);
        when(productsSequence.findFirst(palindromeFilter)).thenReturn(4321L);
        Problem4LargestPalindromeProductSolver sut = new Problem4LargestPalindromeProductSolver(productsSequence, palindromeFilter);
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
