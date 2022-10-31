package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public static void printUntilButThird(int lastPrinted) {
        if (lastPrinted <= 0) {
            System.out.print("");
            return;
        }
        int n = 0;
        do {
            n++;

            if (n % 3 == 0) continue;
            System.out.println(n);
        } while(n < lastPrinted);
    }

    public static void main(String[] args) {
        printUntilButThird(7);
    }
}
