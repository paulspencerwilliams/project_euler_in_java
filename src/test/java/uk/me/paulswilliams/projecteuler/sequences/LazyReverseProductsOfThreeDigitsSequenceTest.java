package uk.me.paulswilliams.projecteuler.sequences;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItemInArray;
import static org.hamcrest.Matchers.lessThan;


public class LazyReverseProductsOfThreeDigitsSequenceTest {


    @Test
    public void testProductsAreInDecreasingOrder()
    {
        long[] products = getProducts();
        for (int i = 0; i < products.length - 2; i++)
        {
            assertThat(products[i+1],lessThan(products[i]));
        }
    }

    @Test
    public void testAllProductsAreIncluded ()
    {
        long[] array = SequenceToArrayConverter.getArray(new LazyReverseProductsOfThreeDigitsSequence());


        Long[] arrayAsLongArray = new Long[array.length];
        for (int i = 0; i < array.length; i++)
        {
            arrayAsLongArray[i] = array[i];
        }

        for (int i = 999; i >= 100; i--)
        {
            for (int j = 999; j >= 999; j--)
            {
                long k = i * j;
                assertThat(arrayAsLongArray, hasItemInArray(equalTo(k)));
            }
        }

    }

    private boolean doesArrayContainValue(long[] array, long k) {
        for (long l : array)
        {
            if (l == k)
            {
                return true;
            }
        }
        return false;
    }

    private Set<Long> getProductsAsSet() {
        return new HashSet(Arrays.asList(getProducts()));
    }

    private long[] getProducts() {
        return SequenceToArrayConverter.getArray(new LazyReverseProductsOfThreeDigitsSequence());
    }




}
