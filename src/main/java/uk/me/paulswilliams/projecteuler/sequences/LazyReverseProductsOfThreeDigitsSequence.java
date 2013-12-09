package uk.me.paulswilliams.projecteuler.sequences;

import java.util.Iterator;
import java.util.TreeSet;

public class LazyReverseProductsOfThreeDigitsSequence implements Sequence {

    TreeSet<Long> products = new TreeSet<Long>();
    public LazyReverseProductsOfThreeDigitsSequence() {
        for (int i = 999; i >= 100; i--)
        {
            for (int j = 999; j >= 100; j--)
            {
                long product = i * j;
                if (!products.contains(product))
                {
                    products.add(product);
                }
            }
        }
    }
    @Override
    public Iterator<Long> iterator() {
        return products.descendingIterator();
    }

}
