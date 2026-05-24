/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stack3;

/**
 *
 * @author akila
 */
public class Stack3 {
 int arr[];
 int top;
 int capacity;
 
 Stack3(int size){
     arr=new int[size];
     capacity=size;
     top=-1;
 }
 boolean IsFull(){
   return top+1==capacity;
 }
 void  push(int x){
     if(IsFull()){
         System.out.println("Overflow.");
     }else{
         top++;
         arr[top]=x;
         System.out.println("Inserting: "+x);
     }
 }
 boolean IsEmpty(){
     return top==-1;
 }
 void pop(){
     if(IsEmpty()){
         System.out.println("Stack is empty.");
     }else{
         System.out.println("Removing: "+arr[top]);
         top--;
     }
     
 }   
    
    
    public static void main(String[] args) {
        Stack3 mystack=new  Stack3(5);
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
        mystack.push(50);
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
    }
}
