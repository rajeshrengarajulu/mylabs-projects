package com.labs.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayUtil
{   
    /**
     * Gets an unique array from the input with order maintained
     *
     * @param myArray
     * @return
     */
    protected int[] getUniqueArrayWithOrderMaintained(int[] myArray) {
        return prepareUniqueArray(myArray, new LinkedHashSet<Integer>());
    }

    /**
     * Gets unique array from the input with no consideration on order
     *
     * @param myArray
     * @return
     */
    protected int[] getUniqueArrayIgnoringOrder(int[] myArray) {
        return prepareUniqueArray(myArray, new HashSet<Integer>());
    }

    /**
     * Prepares an unique array
     *
     * @param myArray
     * @param mySet
     * @return
     */
    private int[] prepareUniqueArray(int[] myArray, Set<Integer> mySet) {
        int[] uniqueArray = new int[myArray.length];
        int i = 0;

        for (int item : myArray) {
            if (mySet.add(item)) {
                uniqueArray[i++] = item;
            }
        }
        return Arrays.copyOf(uniqueArray, i);
    }

    /**
     * Gets unique array - this is one of the ways this could be implemented
     *
     * @param myArray
     * @return
     */
    protected int[] getUniqueArray(int[] myArray) {

        int[] output = new int[myArray.length];
        int counter = 0;

        for (int i = 0; i < myArray.length; i++) {
            boolean isPresent = Boolean.FALSE;
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] == output[j]) {
                    isPresent = Boolean.TRUE;
                    break;
                }
           }
            if (isPresent) {
                continue;
            }
            output[counter] = myArray[i];
            counter++;
        }
        return Arrays.copyOf(output, counter);

    }


}
