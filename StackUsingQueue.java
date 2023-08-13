import java.util.*;

public class StackUsingQueue {
  static class StackA{
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    // isEmpty function
    public static boolean isEmpty(){
      return q1.isEmpty() && q2.isEmpty();
    }

    // add function
    public static void push(int data){
      if(!q1.isEmpty()){
        q1.add(data);
      }else{
        q2.add(data);
      }
    }

    // remove function
    public static int pop(){
      if(isEmpty()){
        System.out.println("stack is empty");
        return -1;
      }
      int top =-1;
      if(!q1.isEmpty()){
        while(!q1.isEmpty()){
          top = q1.remove();
          if(q1.isEmpty()){
            break;
          }
          q2.add(top);
        }
      }else{
        while(!q2.isEmpty()){
          top = q2.remove();
          if(q2.isEmpty()){
            break;
          }
          q1.add(top);
        }
      }
      return top;
    }

    // peek function
    public static int peek(){
      if(isEmpty()){
        System.out.println("stack is empty");
        return -1;
      }
      int top =-1;
      if(!q1.isEmpty()){
        while(!q1.isEmpty()){
          top = q1.remove();
          q2.add(top);
        }
      }else{
        while(!q2.isEmpty()){
          top = q2.remove();
          q1.add(top);
        }
      }
      return top;

    }
    
  }
  public static void main(String[] args) {
    StackA stk = new StackA();
    stk.push(1);
    stk.push(2);
    stk.push(3);

    while(!stk.isEmpty()){
      System.out.println(stk.peek());
      stk.pop();
    }
  }
}
