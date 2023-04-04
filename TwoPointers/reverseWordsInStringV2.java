package TwoPointers;

public class reverseWordsInStringV2{
    public String cleanSpace(char[] a, int n){
        String str = new String(a, 0, n);

        str = str.replaceAll("\\s+"," ").trim();

        return str;
    }
}