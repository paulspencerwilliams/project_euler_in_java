package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import uk.me.paulswilliams.projecteuler.sequences.LazyPrimesSequence;
import uk.me.paulswilliams.projecteuler.sequences.SequenceElementRetriever;

public class Problem710001stPrime {
    public static void main(String[] args) {
        long n= Long.parseLong(args[0]);
        LazyPrimesSequence sequence = new LazyPrimesSequence();
        long value = new SequenceElementRetriever().retrieveNthElement(sequence, n);
        System.out.println(value);
    }
}
