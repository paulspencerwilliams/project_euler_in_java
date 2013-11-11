package uk.me.paulswilliams.projecteuler.problem1;

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

    public NumberGenerator getGenerator() {
        return generator;
    }
}
