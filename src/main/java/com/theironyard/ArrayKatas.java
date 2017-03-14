package com.theironyard;

import java.time.LocalDate;
import java.util.Random;

/**
 * This is another kata exercise. Follow the instructions below and implement
 * the methods as described.
 */
public class ArrayKatas {

    /**
     * Using array literal syntax and the Random class, create a static method
     * named fiveRandomInts() that accepts no arguments and returns a new array
     * containing five random integers.
     * <p>
     * EG: [366316239, 1012739128, 1516029826, -1290176332, 1661141950]
     * <p>
     * Note that the return type for an array of ints would be `int[]`.
     *
     * @return an array of five random ints
     */
    // todo: create fiveRandomInts() static method
    public static int[] fiveRandomInts() {
        Random random = new Random();

        return new int[]{random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt()};
        //int[] x = new int[5];

    }

    /**
     * Create a static method named threeArbitraryDates() that returns an array
     * of three LocalDate objects. Do not use array literal syntax in this
     * method.
     *
     * @return an array of three LocalDate objects
     */
    // todo: create threeArbitraryDates() method
    public static LocalDate[] threeArbitraryDates() {
        //String[] threeArbitraryDates = new String[3];

        LocalDate[] threeArbitraryDates = new LocalDate[3];
        threeArbitraryDates[0] = LocalDate.now();
        threeArbitraryDates[1] = LocalDate.of(1981, 12, 24);
        threeArbitraryDates[2] = LocalDate.now();

        return threeArbitraryDates;
    }

    /**
     * Create a static method named nullsToArbitraryStrings() that accepts an
     * array of String objects. This array will always have five elements. The
     * method should set any null values in the provided array to any arbitrary
     * String. For example, if you receive this array:
     * <p>
     * ["I", null, "food", "cat", null]
     * <p>
     * Then a valid return value would be:
     * <p>
     * ["I", "car", "food", "cat", "elephant"]
     * <p>
     * Any existing String values in the array should be left unchanged.
     * <p>
     * This method should return a string array with five elements, where any
     * null elements have been replaced with arbitrary strings.
     * <p>
     * Note that you do not need to set the size of the array in the argument.
     *
     * @param source an array of five Strings, some of which are null.
     * @return an array of five string where null values have been replaced with arbitrary strings
     */
    // todo: create nullsToArbitraryStrings() method
    public static String [] nullsToArbitraryStrings(String[] source) {
        //String foo = null;
        //if((foo) == null) {
        //foo = "canary";

        for (int x = 0; x <= 4; x++) {
            if (source[x] == null) {
                source[x] = "tood";
            }

        }
        return source;






    }
            // nullsToArbitraryStrings[0] = "Chris";
            // nullsToArbitraryStrings [1] = "Danielle";
            // nullsToArbitraryStrings [2] = "Rogan";
            //nullsToArbitraryStrings [3] = "Rhys";
            //nullsToArbitraryStrings [4] = "Shane";

            /**
             * Create a static method named arrayIndexes() that accepts a single integer
             * argument, n. The method should create a new array of integers of this
             * length. For example, if n is 5, an array of five ints should be created.
             *
             * The array's values should be set to their index. So, an array of five
             * ints should be: [0, 1, 2, 3, 4]
             *
             * @param n The length of the array to create
             * @return An array of ints, starting at 0 and continuing to n-1
             */
            // todo: create arrayIndexes() method

           public static int[] arrayIndexes(int n) {
               int[] hotdog = new int[n];
              for(int x = 0; x < n; x++){
                  hotdog[x] += x;

              }
               return hotdog;

           }
}
