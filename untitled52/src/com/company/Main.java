package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array[] = {5, 1, 91, 1, 59, 1, 45, 178};

        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[size - 1];
                    size--;
                }
            }
        }
        // copy array
        int mas[] = Arrays.copyOf(array, size);
        // print array
        System.out.println(Arrays.toString(mas));
    }
}
