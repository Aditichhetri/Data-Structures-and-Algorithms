package DsaOne.Stack;
import java.util.*;

public class InfixtoPrefix {
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

 
    /*
  * 1.Scan left to right 
  * 2.IF OPERAND push in operand stack
  * 3.IF OPERATOR check precedence if greater ?push in operator stack : pop 2 operand from operand stack and push op + b + a into operand stack 
  *  4.if '(' push in stack
  * 5.if ')'pop till opening is found or stack is not not empty and print
      pop
  */
    static String infixtoPrefix(String exp) {
        
        Stack<Character> operator = new Stack<>();
        Stack<String> operand = new Stack<>();
        // String ans = new String("");
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c))
                operand.push(c+"");
            else if (c == '(')
                operator.push(c);
            else if (c == ')') {
                while (!operator.isEmpty() && operator.peek() != '(') {
                    String operand_1=operand.pop();
                    String operand_2=operand.pop();
                    char opr=operator.pop();
                    String expression = opr+operand_2+operand_1 ;
                    operand.push(expression);
                }
                operand.pop();//will pop opening (
            } 
            else {
                while (!operator.isEmpty() && precedence(c) <= precedence(operator.peek())) {
                    String  operand_1=operand.pop();
                    String  operand_2=operand.pop();
                    char opr=operator.pop();
                    String expression =opr+operand_2+operand_1 ;
                    operand.push(expression);
                }
                operator.push(c);
            }

        }
        while (!operator.empty()){
                    String  operand_1=operand.pop();
                    String  operand_2=operand.pop();
                    char opr=operator.pop();
                    String expression=opr+operand_2+operand_1 ;
                    operand.push(expression);
        }
            
       return operand.peek();
       
    }

    
    public static void main(String[] args) {
        String exp ="A*B+C/D";
     System.out.println(infixtoPrefix(exp));
    }

}
