package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.filters.FactorOfFilter;
import uk.me.paulswilliams.projecteuler.sequences.GeneratorBackedSequence;
import uk.me.paulswilliams.projecteuler.sequences.generators.PrimesNumberGenerator;

public class Problem3LargestPrimeFactorSolver {
    private final Sequence primesSequence;
    private final Filter filter;

    public Problem3LargestPrimeFactorSolver(Sequence primesSequence, Filter filter) {
        this.primesSequence = primesSequence;
        this.filter = filter;
    }

    public static void main(String[] args) {
        Long startsAt = Long.valueOf(args[0]);
        long result = new Problem3LargestPrimeFactorSolver(new GeneratorBackedSequence(new PrimesNumberGenerator((long) Math.sqrt(startsAt))), new FactorOfFilter(startsAt)).solve(startsAt);
        System.out.println(result);
    }

    public long solve(long param) {
        return primesSequence.findFirst(filter);
    }
}
