package uk.me.paulswilliams.projecteuler.problem1.filters;

import uk.me.paulswilliams.projecteuler.problem1.Filter;

public class FilterFactoryImpl implements FilterFactory {

    @Override
    public Filter buildFactorOfFilter(long factorOf) {
        return new FactorOfFilter(factorOf);
    }

    @Override
    public Filter buildEvenFilter() {
        return new EvenFilter();
    }
}
