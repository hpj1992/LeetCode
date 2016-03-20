package Medium;
/*
Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.



Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNumber
{
    public static void main(String[] args)
    {
        List<String> allWords = letterCombinations("23");
        for(int i=0; i< allWords.size(); i++)
        {
            System.out.println(allWords.get(i));
        }
    }
    public static List<String> letterCombinations(String digits) {

        if(digits == null || digits.length() == 0)
            return new ArrayList<String>();
        String[] setup = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        StringBuilder sb = new StringBuilder();
        ArrayList<String> ans = new ArrayList<String>();
        ans.add("");
        for( int i = 0; i < digits.length() ; i++)
        {
            int letter = Character.getNumericValue(digits.charAt(i));
            String letters = setup[letter];
            int curLength = ans.size();
            while(curLength > 0)
            {
                String value = ans.get(curLength-1);
                for(int j=0;j<letters.length();j++)
                {
                    ans.add(value+letters.charAt(j));
                }
                ans.remove(curLength-1);
                curLength--;
            }
        }
        return ans;
    }
}