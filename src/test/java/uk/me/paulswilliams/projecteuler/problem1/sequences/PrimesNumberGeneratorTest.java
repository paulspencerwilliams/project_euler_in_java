package uk.me.paulswilliams.projecteuler.problem1.sequences;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.problem1.sequences.PrimesNumberGenerator;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrimesNumberGeneratorTest {

    @Test
    public void testReturns_empty_For_1 () {
        long[] expected = {};
        long[] actual = getPrimes(1);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_2_For_2 () {
        long[] expected = {2};
        long[] actual = getPrimes(2);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_3_2_For_3 () {
        long[] expected = {3,2};
        long[] actual = getPrimes(3);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_3_2_For_4 () {
        long[] expected = {3,2};
        long[] actual = getPrimes(4);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_5_3_2_For_5 () {
        long[] expected = {5,3,2};
        long[] actual = getPrimes(5);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_7_5_3_2_For_10 () {
        long[] expected = {7,5,3,2};
        long[] actual = getPrimes(10);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturnsCurrentValuesFor_For_100 () {
        long[] expected = {97,89,83,79,73,71,67,61,59,53,47,43,41,37,31,29,23,19,17,13,11,7,5,3,2};
        long[] actual = getPrimes(100);
        assertThat(actual, is(equalTo(expected)));
    }


    private long[] getPrimes(int startAt) {

        ArrayList<Long> additiveList = new ArrayList<Long>();
        for (long l: new PrimesNumberGenerator(startAt))
        {
            additiveList.add(l);
        }
        return toLongArray(additiveList);
    }

    private long[] toLongArray(ArrayList<Long> arrayList) {
        long[] array = new long[arrayList.size()];
        for (int i =0; i < array.length; i++)
        {
            array[i] = arrayList.get(i);
        }
        return array;
    }
}
