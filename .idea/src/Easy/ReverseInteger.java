/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
*/
public class ReverseInteger

{
    public int reverse(int x) {
        int temp = x; //Math.abs(x);
        double ans = 0;
        while(temp!=0)
        {
            int remainder = temp%10;
            temp = temp/10;
            ans = ans*10 + remainder;

        }
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
            return 0;

        return (int)ans;//x<0?(-1)*ans:ans;
    }
}