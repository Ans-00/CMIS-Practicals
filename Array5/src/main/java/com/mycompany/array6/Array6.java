/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array6;

/**
 *
 * @author akila
 */
import java.util.Scanner;
public class Array6 {

    public static void main(String[] args) {
        int[] arr=new int[10];
        int size=5;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Your input data is: ");
        for(int j=0;j<size;j++){
            System.out.println(arr[j]);
        }
        System.out.println("Enter the index that you want to update: ");
        int ind=sc.nextInt();
        System.out.println("Enter the value you want to update: ");
        int val=sc.nextInt();
        arr[ind]=val;
        System.out.println("Your input data is: ");
        for(int j=0;j<size;j++){
            System.out.println(arr[j]);
    }
}
}