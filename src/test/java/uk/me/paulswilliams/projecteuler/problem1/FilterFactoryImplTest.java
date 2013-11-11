package uk.me.paulswilliams.projecteuler.problem1;

import org.junit.Test;

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
}
