package uk.me.paulswilliams.projecteuler.problem1;

public class EvenFilter implements Filter {


    @Override
    public boolean matches(long value) {
        return (value % 2 == 0);
    }
}
