package uk.me.paulswilliams.projecteuler;

public interface Sequence {

    long findFirst(Filter filter);

    long sumAll(Filter filter);
}
