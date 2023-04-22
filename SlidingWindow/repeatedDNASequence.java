package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class repeatedDNASequence {
    public List<String> findRepeatedSequences(String s, int k){
        int windowSize = k;
        int windowStart = 0;
        List<Character> window = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        int hashCode = 0;
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            window.add(s.charAt(windowEnd));
            if(window.size() == windowSize){
                if(map.containsKey(String.valueOf(window))){
                    result.add(String.valueOf(window));
                }
                map.put(String.valueOf(window), map.get(String.valueOf(window)) + 1);
                hashCode = window.hashCode();
                window.remove(windowStart++);
            }
        }
        return result;
    }
}

/*
 * Given a string s that represents a DNA sequence, and a number k, return all the contiguous sequences 
 * of length k that occur more than once in the string. The order of the returned subsequences does not 
 * matter.
 * If no repeated subsequence is found, the function should return an empty set.
 * 
 */
