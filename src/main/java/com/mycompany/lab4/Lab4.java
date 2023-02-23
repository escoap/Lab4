/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab4;



/**
 *
 * @author Andrew
 */
public class Lab4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        countDown(8);
        System.out.println(gcd(45,90));
    }
    
    
    
    //Task1
    //modified task1
    // Time complexity 0(n)
    public static void countDown(int num){

      if (num == 0) // test

                  System.out.println("Blastoff!");

      else if(num%2 ==0){

                  System.out.println("...");

                    countDown(num-1); // recursive call

             }
      else{countDown(num-1);}

}
    
    //Task2
    //modified
    public static int gcd(int x, int y) {
    if(x==y){
        return x;}
    else if(x>y){
        return gcd(x-y,y);
    }
    else{
        return gcd(x,y-x);
    }
    }
    
    
    
    //task 3
    //Time compelexity is 2^n, beacuase each call creates 2 more recurcive calls. This creates a tree with number of calls doubling each time.
    public static int fib(int n){

       if (n <= 0){ // base case

            return 0;}

      else if (n == 1){ // base case

             return 1;}

      else{

             return fib(n-1)+ fib(n-2);}

}
    
    //HW1
    
    public static void helloWorld(int n){
        if(n>0){
            System.out.println("Hello world");
            helloWorld(n-1); 
            
        }
       

}

    
//Hw2
    public static int sumMult7(int n1,int n2){
    if (n1 > n2) {
        return 0;
    } else if (n1 % 7 == 0) {
        return n1 + sumMult7(n1 + 7, n2);
    } else {
        return sumMult7(n1 + (7 - n1 % 7), n2);
    }
}
    
    //HW3
    int binarySearch(int[] arr, int left, int right, int target) {
    if (left > right) {
        return -1;
    }
    int mid = left + (right - left) / 2;
    if (arr[mid] == target) {
        return mid;
    } else if (arr[mid] < target) {
        return binarySearch(arr, mid + 1, right, target);
    } else {
        return binarySearch(arr, left, mid - 1, target);
    }
}

}
