public class LongestCommonPrefix
{
    public static String longestCommonPrefix(String[] strs) {

        if(!(strs.length > 0))
            return "";
        int minIndex = getMinStringIndex(strs);
        String maxPrefix = "";;
        int total = 0;
        for (int i = strs[minIndex].length(); i > 0 ; i--) {
            String prefix = (String) strs[minIndex].subSequence(0, i);
            for (String str : strs) {
                if (!str.startsWith(prefix)) {
                    total = 0;
                    break;
                }
                else
                {
                    total++;
                }

            }
            if(total == strs.length)
            {
                maxPrefix = prefix;
                break;
            }
        }
        return maxPrefix;
    }

    public static int getMinStringIndex(String[] args) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int j = 0; j < args.length; j++) {
            if (args[j].length() < min) {
                min = args[j].length();
                index = j;
            }
        }
        return index;
    }
}