package TwoPointers;

public class reverseWordsInString{
    public String revWords(String str){
        String rev = rev(str);
        int right = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = right; right < rev.length(); i++){
            int left = right;
            while(rev.charAt(right) != ' '){
                right++;
                if(right == rev.length())
                    break;
            }
            String word = rev.substring(left, right);
            String newWord = rev(word);
            sb.append(newWord);
            sb.append(" ");
            right++;
        }
        return sb.toString();
    }
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