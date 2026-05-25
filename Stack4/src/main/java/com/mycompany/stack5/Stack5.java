/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stack5;

/**
 *
 * @author akila
 */
public class Stack5 {
  int top;
  int capacity;
  int arr[];
  
  Stack5(int size){
      capacity=size;
      arr =new int[size];
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
  boolean IsEmpty(){
      return top==-1;
  }
  void pop(){
      if(IsEmpty()){
          System.out.println("Stack is empty. ");
      }else{
          System.out.println("Removing: "+arr[top]);
          top--;
      }
  }
  void PrintStack(){
      System.out.println("Printing Stack.");
      for(int i=0;i<=top;i++){
          System.out.println(arr[i]);
      }
  }
  void size(){
      System.out.println(top+1);
  }
    public static void main(String[] args) {
        Stack5 mystack=new Stack5(5);
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
        mystack.push(50);
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.PrintStack();
        mystack.size();
    }
}
