public class EmplementationUsingArray {
  static class Queue{
    static int arr[];
    static int size;
    static int rear;

    Queue(int n){
      arr = new int[n];
      size = n;
      rear = -1;
    }

    // isEmpty function
    public static boolean isEmpty(){
      return rear == -1;
    }

    // add function
    public static void add(int data){
      // check if the queue is full or not
      if(rear == size-1){
        System.out.println("queue is full");
        return;
      }

      rear = rear+1;
      arr[rear] = data;

    }

    // remove function
    public static int remove(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
      }

      int front = arr[0];
      for(int i =0; i<rear; i++){
        arr[i] = arr[i+1];
      }
      rear = rear-1;
      return front;
    }

    // peek function
    public static int peek(){
      if(isEmpty()){
        System.out.println("queue is empty");
        return-1;
      }
      return arr[0];
    }
  }

  public static void main(String[] args) {
    Queue Q = new Queue(3);
    Q.add(1);
    Q.add(2);
    Q.add(3);
    while(!Q.isEmpty()){
      System.out.println(Q.peek());
      Q.remove();
    }
  }
}
