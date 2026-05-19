/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array3;

/**
 *
 * @author akila
 */
import java.util.Scanner;
public class Array3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int size=5;
        
        
        System.out.println("Enter the value of array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Output of the array: ");
        for(int j=0;j<size;j++){
            System.out.println(arr[j]);
        }
        System.out.println("Enter the index: ");
            int ind=sc.nextInt();
        System.out.println("Enter the value: ");
            int value=sc.nextInt();
        size++;
        
        for(int k=size;k>=ind;k--){
            arr[k]=arr[k-1];
        }
        arr[ind]=value;
         System.out.println("Output of the array: ");
           for(int j=0;j<size;j++){
         System.out.println(arr[j]);     
    }
}
}
