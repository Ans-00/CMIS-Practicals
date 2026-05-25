/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queue3;

/**
 *
 * @author akila
 */
public class Queue3 {
 int front;
 int rear;
 int capacity;
 
 int queueArr[];
 
 Queue3(int size){
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
         System.out.println("Queue is full.");
     }else{
         rear++;
         queueArr[rear]=x;
         System.out.println("Inserting: "+x);
     }
 }
 boolean IsEmpty(){
     return front>rear;
 }
 void Dequeue(){
     if(IsEmpty()){
         System.out.println("Queue is empty. ");
     }else{
         
         System.out.println("Removing: "+queueArr[front]);
         front++;
     }
 }
    public static void main(String[] args) {
        Queue3 myqueue=new Queue3(5);
        myqueue.Enqueue(10);
        myqueue.Enqueue(20);
        myqueue.Enqueue(30);
        myqueue.Enqueue(40);
        myqueue.Enqueue(50);
        myqueue.Dequeue();
    }
}
