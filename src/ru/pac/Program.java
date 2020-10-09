package ru.pac;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        MathRandom(arr1);
        sArray(arr1);
        int[] arr2 = new int[10];
        MathRandom(arr2);
        sArray(arr2);
        int[] arr3 = new int[10];
        MathRandom(arr3);
        sArray(arr3);
        int[] arr4 = new int[10];
        MathRandom(arr4);
        sArray(arr4);
        int[] arr5 = new int[10];
        MathRandom(arr5);
        sArray(arr5);
    }

    public static void sArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }
        System.out.println(" ");
    }

    public static int[] MathRandom(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += Math.random() * 10;
        }
        return arr;

    }
}
