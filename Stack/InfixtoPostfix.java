package DsaOne.Stack;

import java.util.Stack;

public class InfixtoPostfix {
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

    static String infixToPostfix(String exp) {
        String ans = new String("");
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == '(')
                s.push(c);
            // Operand
            else if (Character.isLetterOrDigit(c))
                ans += c;
            else if (c == ')') {
                while (!s.isEmpty() && s.peek() != '(')
                    ans += s.pop();

                    s.pop();
                
            }
            // Operator
            else {
                while (!s.isEmpty() && precedence(c) <= precedence(s.peek()))
                    ans += s.pop();
                
                s.push(c);
            }
        }
    //    Reached expression end
        while(!s.isEmpty())
            ans+=s.pop();
        return ans;

    }

    public static void main(String[] args) {
        String exp= "a*b/(d+c)*e" ;
        System.out.println(infixToPostfix(exp));

    }

}
