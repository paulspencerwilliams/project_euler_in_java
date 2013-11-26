package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Before;
import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.filters.MultipleOfThreeAndFiveFilter;

public class Problem1MultiplesOf3And5Test {

	private Problem1MultiplesOf3And5Solver sut;
	private Filter filter;

	@Before
	public void setUp() throws Exception {
		
		filter = mock(Filter.class);
		sut = new Problem1MultiplesOf3And5Solver(filter);
	}

	@Test
	public void testOutputs0ForBelow2WhenFilterAlwaysReturnFalse() {
		when(filter.matches(anyInt())).thenReturn(false);
		assertThat(sut.sumMultiplesOfThreeAndFiveBelow(2), equalTo(0));
		
	}
	
	@Test
	public void testOutputs1ForBelow2WhenFilterAlwaysReturnTrue () {
		when(filter.matches(anyInt())).thenReturn(true);
		assertThat(sut.sumMultiplesOfThreeAndFiveBelow(2), equalTo(1));
	}

	@Test
	public void testOutputs3ForBelow3WhenFilterAlwaysReturnTrue () {
		when(filter.matches(anyInt())).thenReturn(true);
		assertThat(sut.sumMultiplesOfThreeAndFiveBelow(3), equalTo(3));
	}


    @Test
    public void endToEndSolvedProblem() {

        Filter filter = new MultipleOfThreeAndFiveFilter();
        Problem1MultiplesOf3And5Solver sut = new Problem1MultiplesOf3And5Solver(filter);
        assertThat(sut.sumMultiplesOfThreeAndFiveBelow(1000), equalTo(233168));
    }

	
}
