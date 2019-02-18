package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count =0;
        for (int i = 0; i <objectArray.length ; i++) {
            if(objectArray[i].equals(objectToCount)){
            count+=1;
        }}
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

//        ArrayList<Object> arraytoList = new ArrayList<>();
//        arraytoList.remove(objectToRemove);
//        Object[] newObject = new Object[arraytoList.size()];
//        newObject = arraytoList.toArray(newObject);

        int valuePosition = Arrays.asList(objectArray).indexOf(objectToRemove);
        List<Object> ListArray = new ArrayList<Object>(Arrays.asList(objectArray));
        ListArray.remove(valuePosition);
        Object[] nuevo = new Object[objectArray.length-1];
        nuevo= ListArray.toArray(nuevo);


        return nuevo ;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        HashMap<Object,Object> newObjects= new HashMap<>();

        for (int i = 0; i <objectArray.length ; i++)
            if (newObjects.containsKey(i)) {
                newObjects.put(i, newObjects.get(i));
            }
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        ArrayList<Object> merge = new ArrayList<Object>();
        for (int i = 0; i <objectArray.length-1 ; i++) {
            merge.add(objectArray[i]);
        }
        for (int j = 0; j <objectArrayToAdd.length-1; j++) {
            merge.add(objectArrayToAdd[j]);

        }
        Object[] nuevo = new Object[merge.size()];
        nuevo = merge.toArray(nuevo);
        return nuevo;
    }
}
