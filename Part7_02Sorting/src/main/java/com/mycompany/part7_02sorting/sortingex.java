package com.mycompany.part7_02sorting;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class sortingex {

    public static void main(String[]args) {
        
           // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        //System.out.println(smallest(array));
        //System.out.println(indexOfSmallest(array));
        //System.out.println(indexOfSmallestFrom(array, 2));
        //swap(array, 1, 0);
        sort(array);
    }
    
    public static int smallest(int[] array) {
        // write your code here
        int smallest = array[0];
        for (int i : array) {
            if (smallest > i) {
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        // write your code here
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {
                
                return i;
            }
        }
        return -1;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int startIndexforSubArray = startIndex;
        int[] subArray = new int[table.length - startIndex];
        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = table[startIndexforSubArray];
            startIndexforSubArray++;
        }
        return startIndex + indexOfSmallest(subArray);
    }
    
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temproryValueHolder = array[index1];
        array[index1] = array[index2];
        array[index2] = temproryValueHolder;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
    }
//         int[] small;
//        small = new int[]{8,4,3,1,2,1};
//        System.out.println(smallest(small));
//        System.out.println(indexOfSmallest(small));
//        System.out.println(indexOfSmallestFrom(small,1));
//        Swap(small,0,1);
//        System.out.println("-----------------------");
//        for (int i = 0; i < small.length; i++) {
//            System.out.println(small[i]);
//        }
//  }
//
//    public static int smallest(int[] array) {
//        int aux1 = array[0];
//        for (int i : array) {
//            if (aux1>i) {
//                aux1 = 1;
//            }
//        }
//        return aux1;
//            
//        }
//     public static int indexOfSmallest(int[] array) {
//        // write your code here
//     int smallest = smallest(array);
//         for (int i = 0; i < array.length; i++) {
//             if (smallest ==array[i]) {
//                 smallest = i;
//             }
//         }
//        return smallest;
//        
//        
//        
//     }
//     ///No FUNCIONA;
//    public static int indexOfSmallestFrom(int[] table, int startIndex) {
//        // write your code here
//        int startIndexforSubArray = startIndex;
//        int[] subArray = new int[table.length - startIndex];
//        for (int i = 0; i < subArray.length; i++) {
//            subArray[i] = table[startIndexforSubArray];
//            startIndexforSubArray++;
//        }
//        return startIndex + indexOfSmallest(subArray);
//    }
//    public static void Swap(int[] array, int index1, int index2){
//        int[] auxiliar = new int[1];
//        auxiliar[0] = array[index2];
//        array[index2] = array[index1];
//        array[index1] = auxiliar[0];
//    }
//    



    


    
    

