package DsaOne.Stack;

import java.util.Stack;

public class ValidParentheses {

    boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isOpening(ch)) 
            {
                s.push(ch);
            } 
            else
            {
                if (s.isEmpty()) 
                {
                    return false;
                } 
                else if (!isMatching(s.peek(), ch))
                {
                    return false;
                } 
                else
                {
                    s.pop();
                }
            }
        }

        return s.isEmpty();
    }

    boolean isMatching(char ch, char peekv) {
        return (ch == '{' && peekv == '}') || (ch == '(' && peekv == ')' )|| (ch == '[' && peekv == ']');
    }

    boolean isOpening(char ch) {
        return ch == '{' || ch == '(' || ch == '[';
    }

    public static void main(String[] args) {
        ValidParentheses vp=new ValidParentheses();
    //    String input="({[]})";
        //   String input="))((";
          String input="(){()}";
       System.out.println(vp.isValid(input)); 

    }

}
