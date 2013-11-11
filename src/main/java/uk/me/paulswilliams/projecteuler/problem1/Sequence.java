package uk.me.paulswilliams.projecteuler.problem1;

public interface Sequence {
    long findFirst(Filter filter);

    long sumAll(Filter filter);
}
