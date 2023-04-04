package TwoPointers;

public class reverseWordsInStringV2{
    public String reverseWords(String str){
        char[] s1 = str.toCharArray();
        String str2 = cleanSpace(s1, s1.length);
        StringBuilder sb = new StringBuilder(str2);

        strRev(sb, 0, sb.length() - 1);

        int n = sb.length();
        int start = 0, end = 0;
        while(start < n){
            while(end < n && sb.charAt(end) != ' ')
                ++end;

            strRev(sb, start, end - 1);

            start = end + 1;
            ++end;
        }
        return sb.toString();
    }

    public void strRev(StringBuilder sb, int startRev, int endRev){
        while(startRev < endRev){
            char temp = sb.charAt(startRev);
            sb.setCharAt(startRev++, sb.charAt(endRev));
            sb.setCharAt(endRev--, temp);
        }
    }

    public String cleanSpace(char[] a, int n){
        String str = new String(a, 0, n);

        str = str.replaceAll("\\s+"," ").trim();
        /*
         * \\s+ is a regex expression and is used for matching one
         * or more whitespace.
         * 
         * The original regex expression is \s, but \ being a special
         * character we need to use \\
         */

        return str;
    }
}