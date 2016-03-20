package Medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args)
    {
        for(String str:(new GenerateParentheses().generateParenthesis(4)))
        {
            System.out.println(str);
        }
    }
    public List<String> generateParenthesis(int n) {
        int count = n;
        List<String> answer = new ArrayList<String>();
        answer = makeParentheses(count, count, "", answer);
        return answer;
    }

    public static List<String> makeParentheses(int leftCount, int rightCount, String str, List<String> ans) {
        if (leftCount == 0 && rightCount == 0) {
            ans.add(str);
        }
        String temp = str;
        if (leftCount > 0 && leftCount <= rightCount) {
            str += '(';
            makeParentheses(leftCount - 1, rightCount, str, ans);
        }
        str = temp;
        if (rightCount > 0) {
            str += ')';
            makeParentheses(leftCount, rightCount - 1, str, ans);
        }
        return ans;

    }
}