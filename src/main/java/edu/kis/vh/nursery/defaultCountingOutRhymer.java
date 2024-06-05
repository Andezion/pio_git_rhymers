package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static int NUMBERS_SIZE = 12;

    private static int ERROR_CODE = -1;

    private int[] numbers = new int[NUMBERS_SIZE];

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR_CODE;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_CODE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_CODE;
        return NUMBERS[total--];
    }

}
