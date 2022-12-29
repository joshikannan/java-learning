package com.kannan;


import java.util.Arrays;
import java.util.Scanner;

public class array_of_primitives {
    public static void main(String[] args) {
    int[] a=new int[5];
    Scanner in=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i]=in.nextInt();
        }
   // direct o/p
        System.out.println(Arrays.toString(a)); // o/p-> [ , , , ,]
//for loop
   for (int i=0;i<=a.length;i++){
        System.out.print(a[i]+" ");
    }

// for each loop
        for (int num:a){ // for every element in array, print the element
            System.out.println(num+" ");// num represent each element of the array (a)
        }
        // System.out.println(a[5]);// error-> index out of bound -> only have index 0 tp 4
    }
}

