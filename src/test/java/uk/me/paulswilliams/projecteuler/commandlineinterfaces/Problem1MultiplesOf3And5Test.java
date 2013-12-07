package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.Sequence;

import java.io.PrintStream;

public class Problem1MultiplesOf3And5Test {


    @Test
    public void sumReturnsSumOfEvenValuesInSequence ()
    {
        Sequence wholeNumberSequence = mock(Sequence.class);
        Filter multipleOf3And5Filter= mock(Filter.class);
        when(wholeNumberSequence.sumAll(multipleOf3And5Filter)).thenReturn(4321L);
        Problem1MultiplesOf3And5Solver sut = new Problem1MultiplesOf3And5Solver(wholeNumberSequence, multipleOf3And5Filter);
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
