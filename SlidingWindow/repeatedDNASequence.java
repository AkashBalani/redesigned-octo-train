package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class repeatedDNASequence {
    public List<Integer> findRepeatedSequences(String s, int k) {
        int windowSize = k;
        if (s.length() < windowSize)
            return new ArrayList<>();

        int base = 4;
        int hiPlaceValue = (int) Math.pow(base, windowSize);

        Map<Character, Integer> map = new HashMap<>() {
            {
                put('A', 1);
                put('C', 2);
                put('G', 3);
                put('T', 4);
            }
        };

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            int val = map.get(temp);
            numbers.add(val);
        }
        int hashing = 0;
        Set<Integer> seen = new HashSet<Integer>();
        Set<String> output = new HashSet<String>();

        for (int start = 0; start < s.length() - windowSize + 1; ++start) {
            if (start != 0) {
                hashing = hashing * base;
                hashing -= numbers.get(start - 1) * hiPlaceValue;
                hashing += numbers.get(start + windowSize - 1);
                System.out.print("\tHash of current subsequence, [");
                for (int i = start; i < start + windowSize; i++) {
                    System.out.print(s.charAt(i));
                }
                System.out.println("] = " + hashing);
            } else {
                for (int j = 0; j < windowSize; j++) {
                    hashing = hashing * base + numbers.get(j);
                    System.out.print("\tCalculating hash of first subsequence, ");
                    for (int i = 0; i < j + 1; i++) {
                        System.out.print(s.charAt(i));
                    }
                    System.out.println("= " + hashing);
                }
            }
        }
        return numbers;
    }
}

/*
 * Given a string s that represents a DNA sequence, and a number k, return all
 * the contiguous sequences
 * of length k that occur more than once in the string. The order of the
 * returned subsequences does not
 * matter.
 * If no repeated subsequence is found, the function should return an empty set.
 * 
 */
