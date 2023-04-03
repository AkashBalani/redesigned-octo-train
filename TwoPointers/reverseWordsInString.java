package TwoPointers;

public class reverseWordsInString{
    public String rev(String str){
        int start = 0;
        int end = str.length() - 1;
        char[] ch = new char[str.length()];
        while(start < str.length()){
            ch[start++] = str.charAt(end--);
        }
        return String.valueOf(ch);
    }
}