/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stack2;

/**
 *
 * @author akila
 */
public class Stack2 {
 int arr[];
 int top;
 int capacity;
 
 Stack2(int size){
     arr=new int[size];
     capacity=size;
     top=-1;
 }
 boolean IsFull(){
     return top+1==capacity;
 }
 void push(int x){
     if(IsFull()){
         System.out.println("Overflow.");
     }else{
         top++;
         arr[top]=x;
         System.out.println("Inserting: "+x);
     }
 }
    public static void main(String[] args) {
        Stack2 mystack=new Stack2(5);
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
        mystack.push(50);
        mystack.push(60);
    }
}
