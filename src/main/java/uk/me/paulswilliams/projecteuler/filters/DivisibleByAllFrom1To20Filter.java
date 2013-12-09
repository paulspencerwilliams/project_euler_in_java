package uk.me.paulswilliams.projecteuler.filters;

import uk.me.paulswilliams.projecteuler.Filter;

public class DivisibleByAllFrom1To20Filter implements Filter {

    @Override
    public boolean matches(long value) {
        for (int i = 1; i <= 20; i++)
        {
            if (value % i != 0)
            {
                return false;
            }
        }
        return true;
    }
}
