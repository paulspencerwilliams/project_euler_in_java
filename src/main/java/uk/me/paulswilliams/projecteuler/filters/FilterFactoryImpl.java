package uk.me.paulswilliams.projecteuler.filters;

import uk.me.paulswilliams.projecteuler.Filter;

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
