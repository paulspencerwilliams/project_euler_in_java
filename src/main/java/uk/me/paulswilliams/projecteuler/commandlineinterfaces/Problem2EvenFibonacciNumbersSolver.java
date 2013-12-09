package uk.me.paulswilliams.projecteuler.commandlineinterfaces;


import uk.me.paulswilliams.projecteuler.SequenceAnalyser;
import uk.me.paulswilliams.projecteuler.filters.EvenFilter;
import uk.me.paulswilliams.projecteuler.SequenceAnalyserImpl;
import uk.me.paulswilliams.projecteuler.sequences.LazyFibonacciSequence;

public class Problem2EvenFibonacciNumbersSolver
{
    public static void main( String[] args )
    {
        Long stopsAt = Long.valueOf(args[0]);
        LazyFibonacciSequence lazyFibonacciSequence = new LazyFibonacciSequence(stopsAt);
        EvenFilter filter = new EvenFilter();
        SequenceAnalyser sequenceAnalyser = new SequenceAnalyserImpl();

        long result = sequenceAnalyser.sumAll(lazyFibonacciSequence, filter);

        System.out.println(result);
    }


}
