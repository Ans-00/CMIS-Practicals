/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stack1;

/**
 *
 * @author akila
 */
public class Stack1 {

    int arr[];
    int top;
    int capacity;
    
    Stack1(int size){
        arr =new int[size];
        capacity=size;
        top=-1;
    }
    
        public static void main(String[] args) {
        Stack1 mystack=new Stack1(5);
    }
}
