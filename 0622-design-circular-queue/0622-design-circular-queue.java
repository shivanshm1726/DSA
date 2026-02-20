class MyCircularQueue {
    int size;
    int front;
    int rear;
    int capacity;
    int[] queue;
    public MyCircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        size = 0;
        front = rear = -1; 
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front = 0;
            rear = 0;
        }else{
            rear = (rear+1)%capacity;
        }
        queue[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }

        if(front == rear){
            front = -1;
            rear = -1;
        }else{
            front = (front+1)%capacity;
        }
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return queue[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return queue[rear];
    }
    
    public boolean isEmpty() {
        return (size == 0);
    }
    
    public boolean isFull() {
        return (size == capacity);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */