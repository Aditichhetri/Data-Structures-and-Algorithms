package DsaOne.Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackusingCFW {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
       System.out.println(stack.peek()); 
       System.out.println(stack.pop()); 
       System.out.println(stack.peek()); 
       System.out.println(stack.search(3)); 
       System.out.println(stack.size()); 
   Iterator i=stack.iterator();
    while(i.hasNext()){
        System.out.print(i.next()+" ");
    }
    }
    
}
