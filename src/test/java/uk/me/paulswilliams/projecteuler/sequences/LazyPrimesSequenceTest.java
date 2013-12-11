package uk.me.paulswilliams.projecteuler.sequences;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;

public class LazyPrimesSequenceTest {
    @Test
     public void testFirstElementEquals2(){
        assertThat(getNthPrime(1), is(equalTo(2L)));
    }

    @Test
     public void testSecondElementEquals3(){
        assertThat(getNthPrime(2), is(equalTo(3L)));
    }

    @Test
    public void testThirdElementEquals5(){
        assertThat(getNthPrime(3), is(equalTo(5L)));
    }

    @Test
    public void testFourthElementEquals7(){
        assertThat(getNthPrime(4), is(equalTo(7L)));
    }

    public Long getNthPrime(int n) {
        LazyPrimesSequence sut=new LazyPrimesSequence();
        Iterator<Long> iterator = sut.iterator();
        for (int i = 1; i < n; i++)
        {
            iterator.next();
        }
        return iterator.next();
    }
}
