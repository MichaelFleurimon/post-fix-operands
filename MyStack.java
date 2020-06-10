import java.util.*;
public class MyStack{
  private ArrayList<Double> stack;
  
  public MyStack(){
   stack = new ArrayList<Double>(); 
  }
  
  public void push(Double item){
   stack.add( item ); 
  }
  
  public Double pop(){
   return stack.remove( stack.size() - 1 ); 
  }
  
  public Double peak(){
   return stack.get(stack.size() - 1 ); 
  }
  
  public boolean isEmpty(){
   return stack.size() == 0; 
  }
}


