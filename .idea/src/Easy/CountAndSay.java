package Easy;

/**
 * Created by Harshitkumar_Joshi on 3/7/2016.
 * The count-and-say sequence is the sequence of integers beginning as follows:
 1, 11, 21, 1211, 111221, ...

 1 is read off as "one 1" or 11.
 11 is read off as "two 1s" or 21.
 21 is read off as "one 2, then one 1" or 1211.
 Given an integer n, generate the nth sequence.

 Note: The sequence of integers will be represented as a string.
 */
public class CountAndSay {

    public static void main(String[] args)
    {
        System.out.println(getCountAndSay(6));
    }

    public static String getCountAndSay(int n)
    {
        if(n==0 || n==1)
            return "1";
        String prev = "1";
        StringBuilder sb = new StringBuilder();
        for(int i=2;i<=n;i++)
        {
            for(char ch:prev.toCharArray())
            {
                if(sb.length() > 0 && ch==sb.charAt(sb.length()-1))
                {
                    char count = sb.charAt(sb.length()-2);
                    sb.setCharAt(sb.length()-2,(char)(count+1));
                }
                else
                {
                    sb.append("1");
                    sb.append(ch);
                }
            }
            prev = sb.toString();
            sb = new StringBuilder();

        }
        return prev;
    }
}
