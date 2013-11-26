package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.filters.FilterFactory;
import uk.me.paulswilliams.projecteuler.filters.MultipleOfThreeAndFiveFilter;
import uk.me.paulswilliams.projecteuler.sequences.WholeNumberSequenceFactory;

import java.io.PrintStream;

public class Problem1MultiplesOf3And5Test {

	private Problem1MultiplesOf3And5Solver sut;

    @Test
    public void sumReturnsSumOfEvenValuesInSequence ()
    {
        WholeNumberSequenceFactory sequenceFactory = mock(WholeNumberSequenceFactory.class);
        FilterFactory filterFactory = mock(FilterFactory.class);
        Sequence wholeNumberSequence = mock(Sequence.class);
        when(sequenceFactory.buildIncreasingWholeNumbersBelow(100L)).thenReturn(wholeNumberSequence);
        Filter multipleOf3And5Filter= mock(Filter.class);
        when(filterFactory.buildMultipleOf3And5Filter()).thenReturn(multipleOf3And5Filter);
        when(wholeNumberSequence.sumAll(multipleOf3And5Filter)).thenReturn(4321L);
        Problem1MultiplesOf3And5Solver sut = new Problem1MultiplesOf3And5Solver(sequenceFactory, filterFactory);
        assertThat(sut.solve(100L), is(equalTo(4321L)));
    }


    @Test
    public void endToEndSolvedProblem() {
        System.setOut(mock(PrintStream.class));
        String[] params = {"1000"};
        Problem1MultiplesOf3And5Solver.main(params);
        verify(System.out).println(233168L);
    }

	
}
