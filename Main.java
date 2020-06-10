class Main {
  public static void main(String args[]){ 
     MyStack stack = new MyStack();
     String exp = "34*84/+";
     for( int x=0; x<exp.length(); x++){
       String part = exp.substring( x, x+1);
       String ops="*/+-%";
      //if the character is an operator, follow the rules
      //Fill in BELOW
      if(ops.indexOf(part)>-1){
        if(ops.indexOf(part)==0){stack.push(stack.pop()*stack.pop());}
        if(ops.indexOf(part)==1){
          double sec=stack.pop();
          double fir=stack.pop();
          stack.push(fir/sec);
          }
        if(ops.indexOf(part)==2){stack.push(stack.pop()+stack.pop());}
        if(ops.indexOf(part)==3){
          double sec=stack.pop();
          double fir=stack.pop();
          stack.push(fir-sec);
          }
        if(ops.indexOf(part)==4){
          double sec=stack.pop();
          double fir=stack.pop();
          stack.push(fir%sec);
          }
      }
       else{   //part is a number, push val onto the stack
        double val =  Double.parseDouble(part); 
          stack.push(val);
       }

     }//loop is over
     //Print the value on top of the stack, it is the answer
     System.out.println(""+stack.peak());
  }
}