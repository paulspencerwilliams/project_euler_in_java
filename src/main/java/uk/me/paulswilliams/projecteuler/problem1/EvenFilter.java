package uk.me.paulswilliams.projecteuler.problem1;

public class EvenFilter implements NumberFilter {

    @Override
    public boolean matches(int value) {
        return (value % 2 == 0);
    }
}
