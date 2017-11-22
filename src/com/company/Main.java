package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        float[] initial_array = {2f, 5.6f, 6f, 7f};
        System.out.println(Arrays.toString(initial_array));
        float[] inversed_array = new float[4];
        int index_inversed_array = 0;

        for (int index_initial_Array = initial_array.length - 1; index_initial_Array >= 0; index_initial_Array--){
            inversed_array[index_inversed_array] = initial_array[index_initial_Array];
            System.out.println(inversed_array[index_inversed_array]);
            index_inversed_array ++;
        }
        System.out.println(Arrays.toString(inversed_array));
    }

}