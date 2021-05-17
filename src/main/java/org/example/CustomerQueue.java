package org.example;

public class CustomerQueue {
    private Customer data [];
    private int front;
    private int rear;
    private int count;

    public CustomerQueue(){
        data = new Customer[20];
        front = 0;
        rear = 0;
        count = 0;
    }

    public boolean isEmpty(){
        if(count==0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull(){
        if((rear == front) && count > 0){
            return true;
        }
        else{
            return false;
        }
    }
    public void enqueue(Customer value){
        data[rear] = value;
        rear = (rear + 1) % 20;
        count++;
    }
    public Customer dequeue(){
        Customer value = data[front];
        front = (front + 1) % 20;
        count--;
        return value;

    }
}
