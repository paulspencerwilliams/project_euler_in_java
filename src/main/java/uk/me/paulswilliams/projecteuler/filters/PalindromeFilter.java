package uk.me.paulswilliams.projecteuler.filters;

import uk.me.paulswilliams.projecteuler.Filter;

public class PalindromeFilter implements Filter {

    @Override
    public boolean matches(long value) {
        String original = String.valueOf(value);
        String reversed = new StringBuilder(original).reverse().toString();
        return (original.equals(reversed));
    }
}
