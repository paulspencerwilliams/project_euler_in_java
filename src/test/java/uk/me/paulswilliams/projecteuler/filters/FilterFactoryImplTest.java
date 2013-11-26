package uk.me.paulswilliams.projecteuler.filters;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Filter;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FilterFactoryImplTest {
    @Test
    public void testBuildFactorOfFilterReturnsAFactorOfFilterWithFactorOf() {
        FactorOfFilter actual = (FactorOfFilter) new FilterFactoryImpl().buildFactorOfFilter(123L);
        assertThat(actual, is(instanceOf(FactorOfFilter.class)));
        assertThat(actual.getFactorOf(), is(equalTo(123L)));
    }

    @Test
    public void testBuildEvenFilterReturnsAnEvenFilter() {
        Filter actual = new FilterFactoryImpl().buildEvenFilter();
        assertThat(actual, is(instanceOf(EvenFilter.class)));
    }

    @Test
    public void testBuildMultipleOf3And5FilterReturnsAnEvenFilter() {
        Filter actual = new FilterFactoryImpl().buildMultipleOf3And5Filter();
        assertThat(actual, is(instanceOf(MultipleOfThreeAndFiveFilter.class)));
    }

}
