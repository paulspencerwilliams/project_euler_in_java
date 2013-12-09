package uk.me.paulswilliams.projecteuler.sequences;

import java.util.ArrayList;

public class SequenceToArrayConverter {
    public static long[] getArray(Sequence sequence) {

        ArrayList<Long> additiveList = new ArrayList<Long>();
        for (long l: sequence)
        {
            additiveList.add(l);
        }
        return toLongArray(additiveList);
    }

    private static long[] toLongArray(ArrayList<Long> arrayList) {
        long[] array = new long[arrayList.size()];
        for (int i =0; i < array.length; i++)
        {
            array[i] = arrayList.get(i);
        }
        return array;
    }

}
