package Medium;
/*
Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

 */

public class LongestCommonSubsequence
{
    public static void main(String[] args)
    {
        String one = "AGGTAB";
        String two = "GXTXAYB";
        System.out.println("LCS of "+ one + " AND3 " + two + " :" + getMaxLCS(one,two,one.length(),two.length()));
    }

    public static int getMaxLCS(String string1, String string2, int length1, int length2)
    {
        if(length1==0 || length2==0)
            return  0;

        int[][] dp = new int[length1+1][length2+1];
        //Building DP table in bottom up manner. Maintaining count for LCS for string string1{0 to i} and string2{0 to j}
        for(int i=0; i <= length1; i++)
        {
            for(int j=0; j<= length2; j++)
            {
                if(i==0 || j== 0)
                    dp[i][j] = 0;

                else if(string1.charAt(i-1) == string2.charAt(j-1))
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }
        return dp[length1][length2];
    }
}