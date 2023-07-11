
import java.util.Arrays;

import SlidingWindow.SlidingWindowMaximum;
// import SlidingWindow.repeatedDNASequence;

public class main {
    public static void main(String[] args) {
        // repeatedDNASequence sequence = new repeatedDNASequence();
        // List<String> result = sequence.usingLinearMethod("AGCTGAAAGCTTAGCTG", 5);
        // System.out.println(result);

        SlidingWindowMaximum program = new SlidingWindowMaximum();
        int[] answer = program.findMaxSlidingWindow(new int[]{-4, 5, 4, -4, 4, 6, 7, 20}, 2);
        System.out.println(Arrays.toString(answer));
    }
}
