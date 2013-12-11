package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import uk.me.paulswilliams.projecteuler.calculations.Calculation;
import uk.me.paulswilliams.projecteuler.calculations.CalculationDifference;
import uk.me.paulswilliams.projecteuler.calculations.SquareOfSums;
import uk.me.paulswilliams.projecteuler.sequences.LazyWholeNumbersSequence;
import uk.me.paulswilliams.projecteuler.sequences.Sequence;
import uk.me.paulswilliams.projecteuler.calculations.SumOfSquares;

public class Problem6SumSquareDifference {
    public static void main(String[] params) {
        long stopsAt = Long.parseLong(params[0]);
        Sequence sequence = new LazyWholeNumbersSequence(stopsAt);
        Calculation sumOfSquares = new SumOfSquares(sequence);
        Calculation squareOfSums = new SquareOfSums(sequence);
        Calculation difference = new CalculationDifference(sumOfSquares, squareOfSums);
        System.out.println(difference.getResult());
    }
}
