public class CircularQueue {
  static class Queue{
    static int arr[];
    static int size; 
    static int rear; 
    static int font;

    Queue(int n){
      arr = new int[n];
      size = n;
      rear= -1;
      font = -1;
    }

    // isEmpty function
    public static boolean isEmpty(){
      return rear == -1 && font == -1;
    }

    // isFull function
    public static boolean isFull(){
      return (rear+1)%size == font;
    }
    // Add function
    public static void add(int data){
      if(isFull()){
        System.out.println("Queue is full");
        return;
      }
      // add 1st element
      if(font == -1){
        font =0;
      }
      rear=(rear+1)%size;
      arr[rear] = data;
    }

    // remove function
    public static int remove(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
      }
      int data = arr[font];
      // for last element
      if(font == rear){
        rear = font = -1;
      }else{
        font = (font+1)%size;
      }
      
      return data;
    }

    // peek function
    public static int peek(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
      }
      return arr[font];
    }
  }
  public static void main(String[] args) {
    Queue q = new Queue(3);
    q.add(1);
    q.add(2);
    q.add(3);
    System.out.println(q.remove());
    q.add(4);
    System.out.println(q.remove()); 
    q.add(5);
    while(!q.isEmpty()){
      System.out.println(q.peek());
      q.remove();
    }

  }
}
