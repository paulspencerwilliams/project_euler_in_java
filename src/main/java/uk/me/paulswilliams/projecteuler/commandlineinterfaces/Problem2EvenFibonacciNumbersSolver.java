package uk.me.paulswilliams.projecteuler.commandlineinterfaces;


import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.filters.FilterFactory;
import uk.me.paulswilliams.projecteuler.filters.FilterFactoryImpl;
import uk.me.paulswilliams.projecteuler.sequences.FibonacciSequenceFactory;
import uk.me.paulswilliams.projecteuler.sequences.GeneratorBackedFibonacciSequenceFactory;

public class Problem2EvenFibonacciNumbersSolver
{

    private final FibonacciSequenceFactory sequenceFactory;
    private final FilterFactory filterFactory;


    public Problem2EvenFibonacciNumbersSolver(FibonacciSequenceFactory sequenceFactory, FilterFactory filterFactory) {
        this.sequenceFactory = sequenceFactory;
        this.filterFactory = filterFactory;
    }

    public static void main( String[] args )
    {
        long result = new Problem2EvenFibonacciNumbersSolver(new GeneratorBackedFibonacciSequenceFactory(), new FilterFactoryImpl()).solve(Long.valueOf(args[0]));
        System.out.println(result);
    }


    public long solve(long stopAt) {
        Sequence fibonacciSequence = sequenceFactory.buildIncreasingFibonacciSequenceStoppingAt(stopAt);
        return fibonacciSequence.sumAll(filterFactory.buildEvenFilter());
    }
}
