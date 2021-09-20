package com.codegym;

public class Main {

    public static void main(String[] args) {
	int[] arr = {3,4,5,6,7,8};
        deleteElement(arr, 2);

    }
    public static int[] deleteElement(int[] arr, int index) {
        int n = arr.length - 1;
        int[] arr1 = new int[n];
        for (int i = 0; i < index; i++) {
            arr1[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            arr1[i-1] = arr[i];
        }
        return arr1;
        }
    }

