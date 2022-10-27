import java.awt.*;
import java.util.Stack;

public class ValidParenthesis {

    public static boolean validParenthesis(String value)
    {

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<value.length(); i++)
        {
            char current = value.charAt(i);
            if(value.charAt(i) == '(' || value.charAt(i) == '{' || value.charAt(i) == '[' )
            {
                stack.push(current);
                continue;
            }


            if(stack.isEmpty())
                return false;


            char check = stack.pop();

            switch (check)
            {

                case ')':

                    if(check == '{' || check == '[')
                        return false;
                    break;

                case '}':

                    if(check == '(' || check == '[')
                        return false;
                    break;

                case ']':

                    if(check == '(' || check == '{')
                        return false;
                    break;



            }

        }

        return stack.isEmpty();

    }


    public static void main(String[] args)
    {
        System.out.println(validParenthesis("(([])"));
    }
}
