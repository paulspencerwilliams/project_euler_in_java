package uk.me.paulswilliams.projecteuler.commandlineinterfaces;


import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.filters.EvenFilter;
import uk.me.paulswilliams.projecteuler.sequences.GeneratorBackedSequence;
import uk.me.paulswilliams.projecteuler.sequences.factories.FibonacciSequenceFactory;
import uk.me.paulswilliams.projecteuler.sequences.generators.FibonacciGenerator;

public class Problem2EvenFibonacciNumbersSolver
{

    private final Sequence fibonacciSequence;
    private final Filter filter;


    public Problem2EvenFibonacciNumbersSolver(Sequence fibonacciSequence, Filter filter) {
        this.fibonacciSequence = fibonacciSequence;
        this.filter = filter;
    }

    public static void main( String[] args )
    {
        Long stopsAt = Long.valueOf(args[0]);
        long result = new Problem2EvenFibonacciNumbersSolver(new GeneratorBackedSequence(new FibonacciGenerator(stopsAt)), new EvenFilter()).solve(stopsAt);
        System.out.println(result);
    }


    public long solve(long stopAt) {
        return fibonacciSequence.sumAll(filter);
    }
}
