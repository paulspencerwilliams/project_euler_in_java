package uk.me.paulswilliams.projecteuler.sequences;

import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.NoMatchFoundException;
import uk.me.paulswilliams.projecteuler.Sequence;

public class GeneratorBackedSequence implements Sequence {
    private NumberGenerator generator;

    public GeneratorBackedSequence(NumberGenerator generator) {
        this.generator = generator;
    }

    @Override
    public long findFirst(Filter filter) {
        for (long l: generator)
        {
            if (filter.matches(l))
            {
                return l;
            }
        }
        throw new NoMatchFoundException();
    }

    @Override
    public long sumAll(Filter filter) {
        long sum = 0;
        for (long l: generator)
        {
            if (filter.matches(l))
            {
                sum+=l;
            }
        }
        return sum;
    }

    public NumberGenerator getGenerator() {
        return generator;
    }
}
