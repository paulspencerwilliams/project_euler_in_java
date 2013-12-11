package uk.me.paulswilliams.projecteuler.calculations;

import uk.me.paulswilliams.projecteuler.sequences.Sequence;

public class SumOfSquares implements Calculation {

    private final Sequence sequence;

    public SumOfSquares(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public long getResult() {
        long result  = 0;
        for (long l : sequence)
        {
            result += l * l;
        }
        return result;
    }
}
