package uk.me.paulswilliams.projecteuler.problem1.filters;

import uk.me.paulswilliams.projecteuler.problem1.Filter;

public interface FilterFactory {
    Filter buildFactorOfFilter(long factorOf);

    Filter buildEvenFilter();
}
