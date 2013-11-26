package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.filters.MultipleOfThreeAndFiveFilter;

public class Problem1MultiplesOf3And5Solver {

	private Filter filter;

	public Problem1MultiplesOf3And5Solver(Filter filter) {
		this.filter = filter;
	}

	public static void main(String[] args) {
		Filter multipleOfThreeAndFiveFilter = new MultipleOfThreeAndFiveFilter();
		int result = new Problem1MultiplesOf3And5Solver(multipleOfThreeAndFiveFilter).sumMultiplesOfThreeAndFiveBelow(1000);
		System.out.println(String.valueOf(result));
	}

	public int sumMultiplesOfThreeAndFiveBelow(int maximum) {
		int result = 0;
		for (int i = 0; i< maximum; i++)
		{
			if (filter.matches(i))
			{
				result+=i;
			}
		}
		return result;
	}

}
