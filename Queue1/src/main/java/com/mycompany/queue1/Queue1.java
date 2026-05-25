/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queue1;

/**
 *
 * @author akila
 */
public class Queue1 {
       int front;
       int rear;
       int capacity;
       int noItem;
       
       int queueArr[];
       Queue1(int size){
           capacity=size;
           front=0;
           rear=-1;
           queueArr=new int[size];
           }
       
    public static void main(String[] args) {
        Queue1 myqueue=new Queue1(5);
    }
}
