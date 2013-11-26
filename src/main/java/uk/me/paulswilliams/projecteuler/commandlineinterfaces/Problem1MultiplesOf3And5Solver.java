package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import uk.me.paulswilliams.projecteuler.filters.FilterFactory;
import uk.me.paulswilliams.projecteuler.filters.FilterFactoryImpl;
import uk.me.paulswilliams.projecteuler.sequences.GeneratorBackedFibonacciSequenceFactory;
import uk.me.paulswilliams.projecteuler.sequences.GeneratorBackedWholeNumberSequenceFactory;
import uk.me.paulswilliams.projecteuler.sequences.WholeNumberSequenceFactory;

public class Problem1MultiplesOf3And5Solver {

    private final WholeNumberSequenceFactory sequenceFactory;
    private final FilterFactory filterFactory;

    public Problem1MultiplesOf3And5Solver(WholeNumberSequenceFactory sequenceFactory, FilterFactory filterFactory) {

        this.sequenceFactory = sequenceFactory;
        this.filterFactory = filterFactory;
    }

    public static void main(String[] args) {
        Problem1MultiplesOf3And5Solver problemSolver = new Problem1MultiplesOf3And5Solver(new GeneratorBackedWholeNumberSequenceFactory(), new FilterFactoryImpl());
        System.out.println(problemSolver.solve(Long.parseLong(args[0])));
	}

    public long solve(long below) {
        return sequenceFactory.buildIncreasingWholeNumbersBelow(below).sumAll(filterFactory.buildMultipleOf3And5Filter());
    }
}
