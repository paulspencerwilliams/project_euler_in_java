package uk.me.paulswilliams.projecteuler.problem1;


public class ProblemSolver
{

    public ProblemSolver() {

    }

    public static void main( String[] args )
    {
        Iterable<Integer> fibonacciSequence = new FibonacciSequence(Integer.valueOf(args[0]));
        NumberFilter evenFilter = new EvenFilter();
        System.out.println(new ProblemSolver().sum(fibonacciSequence, evenFilter));
    }

    public int sum(Iterable<Integer> sequence, NumberFilter evenFilter) {

        int result = 0;
        for (Integer i : sequence) {
            if (evenFilter.matches(i))
            {
                result += i;
            }
        }
        return result;
    }
}
