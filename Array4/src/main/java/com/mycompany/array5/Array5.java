/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array5;

/**
 *
 * @author akila
 */
import java.util.Scanner;
public class Array5 {

    public static void main(String[] args) {
        int[] arr=new int[10];
        int size=5;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Your data is: ");
        for(int j=0;j<size;j++){
            System.out.println(arr[j]);
        }
        System.out.println("Enter value for the search: ");
        int data=sc.nextInt();
        int k;
        for(k=0;k<size;k++){
            if(arr[k]==data){
                break;
            }
            
        }
        System.out.println("Index of your value is: "+k);
    }
}
