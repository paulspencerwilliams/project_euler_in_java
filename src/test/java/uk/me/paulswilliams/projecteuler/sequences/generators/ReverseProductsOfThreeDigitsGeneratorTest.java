package uk.me.paulswilliams.projecteuler.sequences.generators;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ReverseProductsOfThreeDigitsGeneratorTest {


    @Test
    public void testProductsAreInDecreasingOrder()
    {
        long[] products = getProducts();
        for (int i = 0; i < products.length - 2; i++)
        {
            assertThat(products[i+1],lessThan(products[i]));
        }
    }

    public void testAllProductsAreIncluded ()
    {
        Set<Long> products = getProductsAsSet();
        for (int i = 999; i >= 100; i--)
        {
            for (int j = 999; j >= 100; j--)
            {
                long product = i * j;
                assertThat(products, contains(product));
            }
        }
    }

    private Set<Long> getProductsAsSet() {
        return new HashSet(Arrays.asList(getProducts()));
    }


    private long[] getProducts() {

        ArrayList<Long> additiveList = new ArrayList<Long>();
        for (long l: new ReverseProductsOfThreeDigitsGenerator())
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
