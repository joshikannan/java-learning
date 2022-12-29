package com.kannan;

import java.util.Arrays;
import java.util.Scanner;

public class array_of_String {
      static void main(String[] args) {
        System.out.print("Enter the no of names : ");
        Scanner no=new Scanner(System.in); // for array size// no of input
        int nos=no.nextInt();
        String[] name=new String[nos];
        //String[] name --> stack memory
        //new String[nos];--> heap memory
        Scanner in=new Scanner(System.in); // string values
        for (int i=0; i<name.length; i++){ // index of array // name.len=2, so i<name.len ******
            name[i]=in.next();
            // name[i]-> ref variable in heap memory **** points towards data
            // ref vari points towards user inputs
            // in.next()-> stores the user input data // *************** imp
        }
        // for loop
        for (int i=0; i<name.length; i++){
            System.out.print("Hi " + name[i]+" ");
        }
        name[1]="zzzzzz"; // value reassigned
        //Enhanced for loop
        for (String s : name) {
            System.out.print("Hi " + s+" ");
        
        }
            for (String s : name) {
            System.out.print("Hi " + s+" ");
    }
}
