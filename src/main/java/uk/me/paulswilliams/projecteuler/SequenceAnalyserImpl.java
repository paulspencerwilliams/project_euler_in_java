package uk.me.paulswilliams.projecteuler;

import uk.me.paulswilliams.projecteuler.sequences.Sequence;

public class SequenceAnalyserImpl implements SequenceAnalyser {

    @Override
    public long findFirst(Sequence sequence, Filter filter) {
        for (long l: sequence)
        {
            if (filter.matches(l))
            {
                return l;
            }
        }
        throw new NoMatchFoundException();
    }

    @Override
    public long sum(Sequence sequence, Filter filter) {
        long sum = 0;
        for (long l: sequence)
        {
            if (filter.matches(l))
            {
                sum+=l;
            }
        }
        return sum;
    }
}
