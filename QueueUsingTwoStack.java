import java.util.*;
public class QueueUsingTwoStack {
  static class Queue{
    static Stack<Integer> stk1 = new Stack<>();
    static Stack<Integer> stk2 = new Stack<>();

    // isEmpty function
    public static boolean isEmpty(){
      return stk1.isEmpty();
    }

    // add function
    public static void add(int data){
      while(!stk1.isEmpty()){
        stk2.push(stk1.pop());
      }

      stk1.push(data);

      while(!stk2.isEmpty()){
        stk1.push(stk2.pop());
      }
    }

    // remove function
    public static int remove(){
      if(isEmpty()){
        System.out.println("queue is empty");
        return-1;
      }
      return stk1.pop();
    }

    // peek function
    public static int peek(){
      if(isEmpty()){
        System.out.println("queue is empty");
        return-1;
      }
      return stk1.peek();
    }
  }
  public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);

    while(!q.isEmpty()){
      System.out.println(q.peek());
      q.remove();
    }
    
  }
}
