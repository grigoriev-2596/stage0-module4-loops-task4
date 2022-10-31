package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        }
        if (numberToSkip < 0) {
            System.out.println("last number in row is negative");
            return;
        }

        int skipSum = 0;
        int countedSum = 0;
        int i = 1;
        do {
            if (i <= numberToSkip) skipSum += i;
            else countedSum += i;
            i++;
        } while(i <= lastInRow);
        System.out.println("skipped sum is " + skipSum);
        System.out.println("counted sum is " + countedSum);
    }
}
