

//Added Queue Data Structure implemented in Java
public class Queue {

    private int maxSize; //size of array
    private int[] queArray;
    private int front; // front
    private int rear; //back
    private int nItems; //num of items

    public Queue(int s){
        maxSize=s;
        queArray=new int[maxSize];
        front=0;
        rear = -1;
        nItems=0;

    }
    //insertion
    public void insert(int j){

        if(rear == maxSize-1){
            System.out.println("Queue is full");
    
    } else{
        queArray[++rear]=j;
        nItems++;
        }

    }
    //remove
    public int remove(){

        if(nItems==0){
            System.out.println("Queue is empty");
            return -99;

        }else{
            nItems--;
            return queArray[front++];
        }
    }
//peek queue
    public int peekFront(){
        if(nItems==0){
            System.out.println("Queue is empty");
            return -99;
        }
        else{
            return queArray[front];
        }
    }
//isempty boolean method
    public void isEmpty(){

        if(nItems==0){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Queu is not empty");
        }
    }

}