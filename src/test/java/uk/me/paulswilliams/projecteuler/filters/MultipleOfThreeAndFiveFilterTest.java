package uk.me.paulswilliams.projecteuler.filters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;
import uk.me.paulswilliams.projecteuler.filters.MultipleOfThreeAndFiveFilter;

public class MultipleOfThreeAndFiveFilterTest {

	private MultipleOfThreeAndFiveFilter sut;

	@Before
	public void setUp() throws Exception {
		sut = new MultipleOfThreeAndFiveFilter();
	}

	@Test
	public void testFalseReturnedForNonMultiple() {
        assertThat(sut.matches(1), equalTo(false));
	}
	
	@Test
	public void testTrueReturnedForMultipleOfThree() {
		assertThat(sut.matches(3), equalTo(true));
	}

	@Test
	public void testTrueReturnedForMultipleOfFive() {
		assertThat(sut.matches(5), equalTo(true));
	}

	@Test
	public void testTrueReturnedForMultipleOfThreeAndFive() {
		assertThat(sut.matches(15), equalTo(true));
	}

}
