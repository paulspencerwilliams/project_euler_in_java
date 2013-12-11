package uk.me.paulswilliams.projecteuler.calculations;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculationDifferenceTest {

    private Calculation smallerCalculation;
    private Calculation largerCalculation;

    @Before
    public void setUp() {
        smallerCalculation = mock(Calculation.class);
        largerCalculation = mock(Calculation.class);

        when (smallerCalculation.getResult()).thenReturn(123L);
        when (largerCalculation.getResult()).thenReturn(234L);
    }

    @Test
    public void testWhenFirstCalculationIsSmallerThanSecond()
    {
        assertThat(new CalculationDifference(smallerCalculation, largerCalculation).getResult(), is(equalTo(111L)));
    }



    @Test
    public void testWhenFirstCalculationIsLargerThanSecond()
    {
        assertThat(new CalculationDifference(largerCalculation, smallerCalculation).getResult(), is(equalTo(111L)));
    }


}
