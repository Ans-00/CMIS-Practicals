/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queue2;

/**
 *
 * @author akila
 */
public class Queue2 {
   int front;
   int rear;
   int capacity;
   int noItem;
   
   int queueArr[];
   
   Queue2(int size){
       capacity=size;
       front=0;
       rear=-1;
       queueArr=new int[size];
   }
   boolean IsFull(){
       return rear+1==capacity;
   }
   void Enqueue(int x){
       if(IsFull()){
           System.out.println("The queue is full.");
       }else{
           rear++;
           queueArr[rear]=x;
           System.out.println("inserting: "+x);
       }
   }
    public static void main(String[] args) {
        Queue2 myqueue=new Queue2(5);
        myqueue.Enqueue(10);
        myqueue.Enqueue(20);
        myqueue.Enqueue(30);
        myqueue.Enqueue(40);
        myqueue.Enqueue(50);
        myqueue.Enqueue(60);
    }
}
