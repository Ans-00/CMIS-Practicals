/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array2;

/**
 *
 * @author akila
 */
import java.util.Scanner;
public class Array2 {

    public static void main(String[] args) {
        int[] arr =new int[5];
        int size =5;
        
        Scanner sc =new Scanner(System.in);
        sc.nextInt();
        System.out.println("Enter data: ");
        for(int j=0;j<size;j++){
            arr[j]=sc.nextInt();
        }  
    System.out.println("Your data: ");
        for(int i=0;i<size;i++){
            
            System.out.println(arr[i]);
        }
    }
}
  