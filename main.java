
import java.util.ArrayList;
import java.util.List;

import SlidingWindow.repeatedDNASequence;

public class main {
    public static void main(String[] args) {
        repeatedDNASequence sequence = new repeatedDNASequence();
        List<String> result = sequence.findRepeatedSequences("AGCTGAAAGCTTAGCTG", 5);;
        System.out.println(result);
    }
}
