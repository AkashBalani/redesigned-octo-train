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
        // Set<Integer> seen = new HashSet<Integer>();
        // Set<String> output = new HashSet<String>();

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

    public List<String> usingLinearMethod(String s, int k) {
        HashSet<String> seen = new HashSet<>(), output = new HashSet<>();
        for (int windowEnd = 0; windowEnd < s.length() - k + 1; windowEnd++) {
            String temp = s.substring(windowEnd, windowEnd + k);
            if (seen.contains(temp))
                output.add(temp);
            seen.add(temp);
        }
        return new ArrayList<>(output);
    }

    public List<String> rabinKarpMethod(String s, int k) {
        if (s.length() < k) {
            return new ArrayList();
        }
        int a = 4, aL = (int) Math.pow(a, k);
        // base a is a rolling hash parameter

        Map<Character, Integer> toInt = new HashMap<>() {
            {
                put('A', 0);
                put('C', 1);
                put('G', 2);
                put('T', 3);
            }
        };

        int[] nums = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            nums[i] = toInt.get(s.charAt(i));
        }

        int h = 0;
        Set<Integer> seen = new HashSet<>();
        Set<String> output = new HashSet<>();

        for (int start = 0; start < s.length() - k + 1; ++start) {
            if(start != 0)
                h = h * a - nums[start - 1] * aL + nums[start + k - 1];
            else
                for(int i = 0; i < k; ++i)
                    h = h * a + nums[i];
            if(seen.contains(h))
                output.add(s.substring(start, start + k));
            seen.add(h);
        }
        return new ArrayList<String>(output);
    }
}

/*
 * Given a string s that represents a DNA sequence, and a number k, return all
 * the contiguous sequences
 * of length k that occur more than once in the string. The order of the
 * returned subsequences does not
 * matter.
 * If no repeated subsequence is found, the function should return an empty set.
 */

/*
 * Notes from Leetcode editorial
 * Linear-time slice using substring + HashSet
 * 1. Move a sliding window of length 'L' on a string of length 'N'
 * 2. For every sequence if it has been seen before update the result,
 * otherwise add it to the seen set.
 *
 * Rabin-Karp: Constant-time Slice using Rolling Hash
 * Rabin-Karp algorithm is used to perform a multiple pattern search.
 * It is used for plagiarism detection and in bioinformatics to look
 * for similaritites in two or more proteins.
 * The idea is to slice over the string and to compute the hash of the
 * sequence in the sliding window, both in a constant time.
 * For this purpose we will convert the String to a number array.
 */
