package uk.me.paulswilliams.projecteuler.filters;

import uk.me.paulswilliams.projecteuler.Filter;

public class EvenFilter implements Filter {

    @Override
    public boolean matches(long value) {
        return (value % 2 == 0);
    }
}
