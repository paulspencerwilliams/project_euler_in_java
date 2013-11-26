package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.filters.FilterFactory;
import uk.me.paulswilliams.projecteuler.filters.FilterFactoryImpl;
import uk.me.paulswilliams.projecteuler.sequences.factories.GeneratorBackedPrimesSequenceFactory;
import uk.me.paulswilliams.projecteuler.sequences.factories.PrimesSequenceFactory;

public class Problem3LargestPrimeFactorSolver {
    private final PrimesSequenceFactory primesSequenceFactory;
    private final FilterFactory filterFactory;

    public Problem3LargestPrimeFactorSolver(PrimesSequenceFactory primesSequenceFactory, FilterFactory filterFactory) {
        this.primesSequenceFactory = primesSequenceFactory;
        this.filterFactory = filterFactory;
    }

    public static void main(String[] args) {
        long result = new Problem3LargestPrimeFactorSolver(new GeneratorBackedPrimesSequenceFactory(), new FilterFactoryImpl()).solve(Long.valueOf(args[0]));
        System.out.println(result);
    }

    public long solve(long param) {
        Sequence primesSequence = primesSequenceFactory.buildDecreasingPrimesSequence((long) Math.sqrt(param));
        return primesSequence.findFirst(filterFactory.buildFactorOfFilter(param));
    }
}
