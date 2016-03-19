import java.util.Stack;

public class ValidParentheses
{
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<Character>();

        if( s == null || s.length()==0)
            return false;
        else
        {
            char[] letters = s.toCharArray();
            for(int i=0;i<letters.length;i++)
            {
                char ch = letters[i];
                switch(ch)
                {
                    case '{' : brackets.push(ch);break;
                    case '(' : brackets.push(ch);break;
                    case '[' : brackets.push(ch);break;
                    case '}' :
                    {
                        if(brackets.size() == 0 || !brackets.peek().equals('{'))
                            return false;
                        else
                            brackets.pop();

                        break;
                    }
                    case ']' :
                    {
                        if(brackets.size() == 0 || !brackets.peek().equals('['))
                            return false;
                        else
                            brackets.pop();

                        break;
                    }
                    case ')' :
                    {
                        if(brackets.size() == 0 || !brackets.peek().equals('('))
                            return false;
                        else
                            brackets.pop();

                        break;
                    }
                }
            }
            if(brackets.size() > 0)
                return false;
            else
                return true;
        }
    }
}