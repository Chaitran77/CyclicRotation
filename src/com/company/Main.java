package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] A = {3, 8, 9, 7, 6};

        System.out.println(Arrays.toString(solution(A, 1010000000)));

    }

    public static int[] solution(int[] A, int K) {

        int[] rotatedArray = A;

        for (int i = 0; i < K; i++) {
            int lastInt = A[A.length-1];

            // shift everything to the right 1 place
            for (int j = A.length - 2; j >= 0; j--) {
                rotatedArray[j+1] = rotatedArray[j];
            }

            rotatedArray[0] = lastInt;
        }

        return rotatedArray;
    }
}
