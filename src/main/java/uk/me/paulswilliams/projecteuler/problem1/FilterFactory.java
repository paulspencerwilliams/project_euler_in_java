package uk.me.paulswilliams.projecteuler.problem1;

public interface FilterFactory {
    Filter buildFactorOfFilter(long factorOf);

    Filter buildEvenFilter();
}
