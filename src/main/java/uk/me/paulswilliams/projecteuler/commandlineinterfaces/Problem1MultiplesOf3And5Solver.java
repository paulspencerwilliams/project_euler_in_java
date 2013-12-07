package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.filters.MultipleOfThreeAndFiveFilter;
import uk.me.paulswilliams.projecteuler.sequences.GeneratorBackedSequence;
import uk.me.paulswilliams.projecteuler.sequences.generators.WholeNumberGenerator;

public class Problem1MultiplesOf3And5Solver {

    private final Sequence sequence;
    private final Filter filter;

    public Problem1MultiplesOf3And5Solver(Sequence sequence, Filter filter) {
        this.sequence = sequence;
        this.filter = filter;
    }

    public static void main(String[] args) {
        long below = Long.parseLong(args[0]);
        Problem1MultiplesOf3And5Solver problemSolver = new Problem1MultiplesOf3And5Solver(new GeneratorBackedSequence(new WholeNumberGenerator(below)), new MultipleOfThreeAndFiveFilter());
        System.out.println(problemSolver.solve(below));
	}

    public long solve(long below) {

        return sequence.sumAll(filter);
    }
}
