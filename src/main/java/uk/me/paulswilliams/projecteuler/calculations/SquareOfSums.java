package uk.me.paulswilliams.projecteuler.calculations;

import uk.me.paulswilliams.projecteuler.sequences.Sequence;

public class SquareOfSums implements Calculation {

    private final Sequence sequence;

    public SquareOfSums(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public long getResult() {
        long sum  = 0;
        for (long l : sequence)
        {
            sum+=l;
        }
        return sum * sum;
    }
}
