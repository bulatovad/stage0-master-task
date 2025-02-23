package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"Winter", "Spring", "Summer", "Autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] array = new int[length];
        for(int i=0; i<length; i++) {
            array[i] = i+1;
        }
        return  array;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == number) return i;
        }

        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] array = new String[arr.length];
        for(int i = 0; i< array.length; i++) {
            array[i] = arr[arr.length-1-i];
        }
        return array;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int numOfPositive = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>0) numOfPositive++;
        }
        int[] onlyPositive = new int[numOfPositive];
        int j=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>0) onlyPositive[j++] = arr[i];
        }
        return onlyPositive;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int[][] newArray = arr.clone();

        for(int i=1; i< newArray.length; i++) {
            int[] key = newArray[i];
            int j= i-1;
            while (j>=0 && key.length < newArray[j].length) {
                newArray[j+1] = newArray[j];
                j--;
            }
            newArray[j + 1] = key;

            for(int l=0; l<newArray[i].length; l++) {
                for(int k=l+1; k<newArray[i].length; k++)
                    if(newArray[i][k]<newArray[i][l]) {
                        int temp = newArray[i][l];
                        newArray[i][l] = newArray[i][k];
                        newArray[i][k] = temp;
                    }
            }
        }
        return newArray;
    }

}
