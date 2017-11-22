package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        float[] my_array = {2f, 5.6f, 6f, 7f};
        System.out.println(Arrays.toString(my_array));
        float[] inversed_array = new float[4];
        int j=0;
        for (int i = my_array.length - 1; i >= 0; i--){
            inversed_array[j] = my_array[i];
            System.out.println(inversed_array[j]);
                j++;
            }
       System.out.println(Arrays.toString(inversed_array));
        }

    }
