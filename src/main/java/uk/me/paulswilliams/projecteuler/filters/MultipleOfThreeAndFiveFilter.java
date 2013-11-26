package uk.me.paulswilliams.projecteuler.filters;

import uk.me.paulswilliams.projecteuler.Filter;

public class MultipleOfThreeAndFiveFilter implements Filter {

	@Override
	public boolean matches(long value) {
		return ((value % 3 == 0) || (value % 5 == 0));
	}

}
