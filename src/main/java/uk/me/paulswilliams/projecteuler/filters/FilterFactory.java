package uk.me.paulswilliams.projecteuler.filters;

import uk.me.paulswilliams.projecteuler.Filter;

public interface FilterFactory {
    Filter buildFactorOfFilter(long factorOf);

    Filter buildEvenFilter();

    Filter buildMultipleOf3And5Filter();
}
