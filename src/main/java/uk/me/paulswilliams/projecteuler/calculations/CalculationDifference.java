package uk.me.paulswilliams.projecteuler.calculations;

public class CalculationDifference implements Calculation {

    private final Calculation first;
    private final Calculation second;

    public CalculationDifference(Calculation first, Calculation second) {

        this.first = first;
        this.second = second;
    }

    @Override
    public long getResult() {
        return Math.abs(second.getResult() - first.getResult());
    }
}
