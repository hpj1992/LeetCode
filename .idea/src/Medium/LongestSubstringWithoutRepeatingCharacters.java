/*
Given a string, find the length of the longest substring without repeating characters.
For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
For "bbbbb" the longest substring is "b", with the length of 1.
 */
class LongestSubstringNoRepeats_3 {
    public static void main(String[] args) {
        System.out
                .println("Length of Longest substring without repeating characters: "
                        );
        System.out.println(lengthOfLongestSubstring2("abcdefghiapoewrd "));
    }


    public static int lengthOfLongestSubstring2(String s)
    {
        if(s==null || s.length() == 0)
            return 0;
        else
        {
            int maxLength = 0;
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length();i++)
            {
                char character = s.charAt(i);
                if(sb.indexOf(String.valueOf(character)) >= 0)
                {
                    maxLength = (maxLength > sb.length()) ? maxLength : sb.length();
                    sb = new StringBuilder(sb.substring(sb.indexOf(String.valueOf(character))+1));
                    sb.append(character);
                }
                else
                {
                    sb.append(String.valueOf(character));
                }
            }
            maxLength = (maxLength > sb.length()) ? maxLength : sb.length();
            return maxLength;
        }

    }
}

