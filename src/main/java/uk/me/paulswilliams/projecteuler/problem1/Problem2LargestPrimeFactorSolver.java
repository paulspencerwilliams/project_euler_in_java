package uk.me.paulswilliams.projecteuler.problem1;

public class Problem2LargestPrimeFactorSolver {
    private final PrimesSequenceFactory primesSequenceFactory;
    private final FilterFactory filterFactory;

    public Problem2LargestPrimeFactorSolver(PrimesSequenceFactory primesSequenceFactory, FilterFactory filterFactory) {
        this.primesSequenceFactory = primesSequenceFactory;
        this.filterFactory = filterFactory;
    }

    public static void main(String[] args) {
        long result = new Problem2LargestPrimeFactorSolver(new GeneratorBackedPrimesSequenceFactory(), new FilterFactoryImpl()).solve(Long.valueOf(args[0]));
        System.out.println(result);
    }

    public long solve(long param) {
        Sequence primesSequence = primesSequenceFactory.buildDecreasingPrimesSequence((long) Math.sqrt(param));
        return primesSequence.findFirst(filterFactory.buildFactorOfFilter(param));
    }
}
