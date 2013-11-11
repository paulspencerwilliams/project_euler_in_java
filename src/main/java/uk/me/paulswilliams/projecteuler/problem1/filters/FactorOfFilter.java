package uk.me.paulswilliams.projecteuler.problem1.filters;

import uk.me.paulswilliams.projecteuler.problem1.Filter;

public class FactorOfFilter implements Filter {
    private long factorOf;

    public FactorOfFilter(long factorOf) {
        this.factorOf = factorOf;
    }

    public long getFactorOf() {
        return factorOf;
    }

    @Override
    public boolean matches(long value) {
        return (factorOf % value == 0);
    }
}
